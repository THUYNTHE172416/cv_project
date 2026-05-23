package controller.auth;

import dal.userdao.LoginDao;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import template.SendMail;
import utils.GenerateCodeUtils;

@WebServlet(urlPatterns = {"/auth/confirm-otp"})
public class ConfirmOtpController extends HttpServlet {

    private final String URL_FE = "/view/confirm-otp.jsp";
    private String otp = null;
    private String userId = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username = request.getParameter("u");
            if (username == null) {
                request.setAttribute("type", "error");
                request.setAttribute("mess", "The user not found!");
                request.setAttribute("href", "find");
            } else {
                LoginDao dao = new LoginDao();
                User user = dao.findUserByUserNameOrEmail(username);
                if (user == null) {
                    request.setAttribute("type", "error");
                    request.setAttribute("mess", "The user not found!");
                    request.setAttribute("href", "find");
                } else {
                    if (user.getEmail() == null || user.getEmail().isBlank()) {
                        request.setAttribute("type", "error");
                        request.setAttribute("mess", "The email is null");
                        request.setAttribute("href", "find");
                    } else {
                        otp = GenerateCodeUtils.code("");
                        if (otp.isBlank()) {
                            request.setAttribute("type", "error");
                            request.setAttribute("mess", "The system error.");
                            request.setAttribute("href", "find");
                        } else {
                            userId = user.getUserId();
                            SendMail.sendOtp(user.getEmail(), otp);
                        }
                    }
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String otpPram = request.getParameter("otp");
            if (otpPram == null || otpPram.isBlank() || !otpPram.equals(otp)) {
                request.setAttribute("type", "error");
                request.setAttribute("mess", "Verify Error.");
            } else {
                request.setAttribute("href", "change-password?uId=" + userId);
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
