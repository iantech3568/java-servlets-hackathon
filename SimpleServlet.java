package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // Set response content type
        response.setContentType("text/html");

        // Generate HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Processed User Input</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("</body></html>");
    }
}
