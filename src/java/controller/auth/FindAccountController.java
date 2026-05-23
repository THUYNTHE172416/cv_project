package controller.auth;

import dal.userdao.LoginDao;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet(urlPatterns = {"/auth/find"})
public class FindAccountController extends HttpServlet {
    
    private final String URL_FE = "/view/find-account.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            request.setAttribute("type", "error" );
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
            LoginDao dao = new LoginDao();
            User user = dao.findUserByUserNameOrEmail(username);
            if (user == null) {
                request.setAttribute("type", "error" );
                request.setAttribute("mess", "Username or email does not exist.");
            } else {
                request.setAttribute("href", "confirm-otp?u=" + username );
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
