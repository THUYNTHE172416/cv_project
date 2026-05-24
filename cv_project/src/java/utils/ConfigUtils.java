package utils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigUtils {

    // Cache lưu trữ các file đã load để không phải đọc lại nhiều lần
    private static final Map<String, Properties> cache = new HashMap<>();

    /**
     * Hàm dùng chung để load file .properties
     */
    private static Properties getProperties(String fileName) {
        // Nếu file đã được load trước đó, lấy luôn từ cache
        if (cache.containsKey(fileName)) {
            return cache.get(fileName);
        }

        Properties props = new Properties();
        // Tự động thêm "/resources/" nếu người dùng truyền thiếu
        String path = fileName.startsWith("/") ? fileName : "/resources/" + fileName;

        try (InputStream input = ConfigUtils.class.getResourceAsStream(path)) {
            if (input == null) {
                throw new RuntimeException("KHÔNG TÌM THẤY FILE: " + path + ". Hãy kiểm tra lại vị trí file.");
            }
            props.load(input);
            cache.put(fileName, props); // Lưu vào cache cho lần gọi sau
            return props;
            
        } catch (Exception e) {
            throw new RuntimeException("Lỗi load cấu hình từ file: " + fileName, e);
        }
    }

    /**
     * Lấy giá trị String
     */
    public static String get(String fileName, String key) {
        Properties props = getProperties(fileName);
        String value = props.getProperty(key);
        return (value != null) ? value.trim() : null;
    }

    /**
     * Lấy giá trị int
     */
    public static int getInt(String fileName, String key) {
        String value = get(fileName, key);
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Không tìm thấy giá trị cấu hình cho key: '" + key + "' trong file '" + fileName + "'");
        }
        return Integer.parseInt(value);
    }
}