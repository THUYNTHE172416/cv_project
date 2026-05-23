package controller.auth;

import dal.userdao.LoginDao;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.PasswordUtils;

@WebServlet(urlPatterns = {"/auth/change-password"})
public class ChangePasswordController extends HttpServlet {
    
    private final String URL_FE = "/view/change-password.jsp";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String uId = request.getParameter("uId");
            if (uId == null || uId.isBlank()) {
                request.setAttribute("type", "error");
                request.setAttribute("mess", "The system error. Please try again!");   
                request.setAttribute("href", "find");
            } else {
                request.setAttribute("uId", uId);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            request.setAttribute("type", "error");
            request.setAttribute("mess", "The system error. Please try again!");        
        } finally {
            request.getRequestDispatcher(URL_FE).forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String newPassword = request.getParameter("newPassword");
            String rePassword = request.getParameter("rePassword");
            String uId = request.getParameter("uId");
            
            if (newPassword == null || rePassword == null || uId == null || uId.isBlank() || newPassword.isBlank() || rePassword.isBlank() || !newPassword.equals(rePassword)) {
                request.setAttribute("type", "error");
                request.setAttribute("mess", "Both New Password and Re Password must be matche.");
            } else {
                LoginDao dao = new LoginDao();
                int col = dao.changePassword(uId, PasswordUtils.hashPassword(newPassword));
                if (col <= 0) {
                    request.setAttribute("type", "error");
                    request.setAttribute("mess", "Change password fails.");
                } else {
                    request.setAttribute("type", "success");
                    request.setAttribute("mess", "Change password successfully.");
                    request.setAttribute("href", "login");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            request.setAttribute("type", "error");
            request.setAttribute("mess", "The system error. Please try again!");
        } finally {
            request.getRequestDispatcher(URL_FE).forward(request, response);

        }
    }
}
