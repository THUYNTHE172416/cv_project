package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/base"})
public class Base extends HttpServlet {
    
    private final String URL_FE = "/base.jsp";

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
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            request.setAttribute("type", "error");
            request.setAttribute("mess", "The system error. Please try again!");
        } finally {
            request.getRequestDispatcher(URL_FE).forward(request, response);

        }
    }
}
