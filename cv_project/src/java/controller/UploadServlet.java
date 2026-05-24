package controller;

import utils.CloudinaryUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;

@WebServlet(name = "UploadServlet", urlPatterns = {"/upload"})
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2,  // 2MB 
    maxFileSize = 1024 * 1024 * 10,       // 10MB 
    maxRequestSize = 1024 * 1024 * 15     // 15MB 
)
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Nếu ai đó gõ trực tiếp /upload lên thanh URL, đẩy họ về trang index
        response.sendRedirect("index.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Setup tiếng Việt cho response
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            // Lấy file từ request. Tên "file" phải khớp chính xác với name="file" trong thẻ <input> của HTML
            Part filePart = request.getPart("file");
            
            // Gọi hàm upload từ class CloudinaryUtils của bạn
            String imageUrl = CloudinaryUtils.upload(filePart);
            
            // In kết quả trực tiếp ra màn hình để kiểm tra
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2 style='color: green;'>Upload Thành Công! 🎉</h2>");
            response.getWriter().println("<p><b>Link ảnh gốc:</b> <a href='" + imageUrl + "' target='_blank'>" + imageUrl + "</a></p>");
            
            // Hiển thị luôn ảnh vừa upload
            response.getWriter().println("<div><img src='" + imageUrl + "' alt='Uploaded Image' style='max-width: 500px; border: 1px solid #ccc;' /></div>");
            
            response.getWriter().println("<br><a href='index.html'>Quay lại</a>");
            response.getWriter().println("</body></html>");
            
        } catch (Exception e) {
            // Bắt lỗi và in ra màn hình nếu quá trình upload thất bại
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2 style='color: red;'>Upload Thất Bại! ❌</h2>");
            response.getWriter().println("<p><b>Lý do lỗi:</b> " + e.getMessage() + "</p>");
            response.getWriter().println("<br><a href='index.html'>Thử lại</a>");
            response.getWriter().println("</body></html>");
            
            // In chi tiết lỗi ra console của NetBeans để tiện debug
            e.printStackTrace();
        }
    }
}