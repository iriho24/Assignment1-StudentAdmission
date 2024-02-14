package com.student.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Retrieve username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Example authentication logic (replace with your own)
        if ("admin".equals(username) && "password".equals(password)) {
            // Authentication successful, redirect to success page
            response.sendRedirect("success.html");
        } else {
            // Authentication failed, redirect back to login page with error message
            response.sendRedirect("login.html?error=1");
        }
    }
}
