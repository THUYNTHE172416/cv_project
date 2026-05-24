package controller.auth;

import dal.userdao.LoginDao;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import utils.PasswordUtils;

@WebServlet(urlPatterns = {"/auth/register"})
public class ResgisterController extends HttpServlet {
    
    private final String URL_FE = "/view/register.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
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
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            User u = new User();
            u.setUsername(username);
            u.setEmail(email);
            u.setPassword(PasswordUtils.hashPassword(password));
            
            LoginDao dao = new LoginDao();
            int col = dao.register(u);
            if (col <= 0) {
                request.setAttribute("type", "error" );
                request.setAttribute("mess", "The system error cannot register account. Please try again.");
            } else {
                request.setAttribute("type", "success" );
                request.setAttribute("mess", "Register successfully!");
                request.setAttribute("href", "login" );
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            request.setAttribute("type", "error" );
            request.setAttribute("mess", "The system error. Please try again!");
        } finally {
            request.getRequestDispatcher(URL_FE).forward(request, response);
        }
    }
}
