package utils;

import jakarta.servlet.http.Part;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;

public class CloudinaryUtils {
    private static final String FILE_PROPERTIES = "cloudinary.properties";
    private static final String CLOUD_NAME = ConfigUtils.get(FILE_PROPERTIES, "CLOUDINARY_CLOUD_NAME");
    private static final String API_KEY = ConfigUtils.get(FILE_PROPERTIES, "CLOUDINARY_API_KEY");
    private static final String API_SECRET = ConfigUtils.get(FILE_PROPERTIES, "CLOUDINARY_API_SECRET");
    private static final int MAX_SIZE = ConfigUtils.getInt(FILE_PROPERTIES,"MAX_SIZE_IMAGE");
    
    public static String upload(Part filePart) throws Exception {

        validate(filePart);
        
        if (CLOUD_NAME == null || API_KEY == null || API_SECRET == null) {
            throw new RuntimeException("Missing config cloudinary in file properties!");
        }

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        String signature = generateSignature(timestamp, API_SECRET);
        String boundary = "----Boundary" + System.currentTimeMillis();

        String urlStr = "https://api.cloudinary.com/v1_1/" + CLOUD_NAME + "/image/upload";
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        try {
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

            try (OutputStream output = conn.getOutputStream();
                 PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"), true)) {

                formField(writer, boundary, "api_key", API_KEY);
                formField(writer, boundary, "timestamp", timestamp);
                formField(writer, boundary, "signature", signature);

                writer.append("--").append(boundary).append("\r\n");
                writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"")
                        .append(filePart.getSubmittedFileName())
                        .append("\"\r\n");
                writer.append("Content-Type: ").append(filePart.getContentType()).append("\r\n\r\n").flush();

                try (InputStream is = filePart.getInputStream()) {
                    byte[] buffer = new byte[8192]; 
                    int bytesRead;
                    while ((bytesRead = is.read(buffer)) != -1) {
                        output.write(buffer, 0, bytesRead);
                    }
                }
                output.flush();
                
                writer.append("\r\n--").append(boundary).append("--\r\n").flush();
            }

            int responseCode = conn.getResponseCode();
            StringBuilder result = new StringBuilder();
            
            InputStream responseStream = (responseCode >= 200 && responseCode < 300) 
                                         ? conn.getInputStream() 
                                         : conn.getErrorStream();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream, "UTF-8"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
            }

            // Nếu HTTP Code không phải 2xx, quăng lỗi ngay lập tức
            if (responseCode < 200 || responseCode >= 300) {
                throw new RuntimeException("Cloudinary API Error (" + responseCode + "): " + result.toString());
            }

            return extractUrl(result.toString());

        } finally {
            conn.disconnect();
        }
    }

    private static void validate(Part filePart) {
        if (filePart == null || filePart.getSize() == 0) {
            throw new RuntimeException("File cannot empty!");
        }

        String contentType = filePart.getContentType();
        if (contentType == null || !contentType.startsWith("image/")) {
            throw new RuntimeException("The system only can accept file type (image/*)!");
        }

        long sizeMB = filePart.getSize() / (1024 * 1024);
        
        if (sizeMB > MAX_SIZE) {
            throw new RuntimeException("Image size (" + sizeMB + "MB) exceeding the permitted limit is" + MAX_SIZE + "MB.");
        }
    }

    private static String generateSignature(String timestamp, String API_SECRET) throws Exception {
        String toSign = "timestamp=" + timestamp + API_SECRET;
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digest = md.digest(toSign.getBytes("UTF-8"));

        StringBuilder hex = new StringBuilder();
        for (byte b : digest) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

  
    private static void formField(PrintWriter writer, String boundary, String name, String value) {
        writer.append("--").append(boundary).append("\r\n");
        writer.append("Content-Disposition: form-data; name=\"").append(name).append("\"\r\n\r\n");
        writer.append(value).append("\r\n");
    }


    private static String extractUrl(String json) {
        String keyToFind = "\"secure_url\":\"";
        int start = json.indexOf(keyToFind);
        if (start == -1) {
            throw new RuntimeException("No image links were found in Cloudinary's response.");
        }
        start += keyToFind.length();
        int end = json.indexOf("\"", start);
        return json.substring(start, end);
    }
}