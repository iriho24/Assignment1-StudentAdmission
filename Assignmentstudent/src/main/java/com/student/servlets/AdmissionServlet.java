package com.student.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AdmissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve information from request parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        // Process the information (e.g., store it in a database)
        
        // Generate the preview of entered information
        String preview = "Student Information:\n" +
                         "First Name: " + firstName + "\n" +
                         "Last Name: " + lastName + "\n" +
                         "Email: " + email;
        
        // Set content type and write the preview to the response
        response.setContentType("text/plain");
        response.getWriter().println(preview);
    }
}
