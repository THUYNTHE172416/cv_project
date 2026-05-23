package controller.auth;

import dal.userdao.LoginDao;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet(name = "userControllers", urlPatterns = {"/auth/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/view/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            // login
            if (username != null && password != null && !username.isBlank() && !password.isBlank()) {
                LoginDao loginDao = new LoginDao();
                User u = loginDao.login(username, password);
                if (u == null) {
                    request.setAttribute("error", "Username or password incorrect. Please try again!");
                } else {
                    request.getSession().setAttribute("user", u);
                    request.setAttribute("type", "success");
                    request.setAttribute("mess", "Login successfully!");
                    request.setAttribute("href", request.getContextPath() + "/home");
                }
            } else {
                request.setAttribute("type", "error");
                request.setAttribute("mess", "Please enter username and password");
            }
        } catch (Exception e) {
            request.setAttribute("type", "error");
            request.setAttribute("mess", "The system error cannot login!");
        }
        request.getRequestDispatcher("/view/login.jsp").forward(request, response);
    }
}
