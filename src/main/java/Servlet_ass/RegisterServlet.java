package Servlet_ass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve form parameters (must match the 'name' attributes in HTML)
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        // Display submitted data
        out.println("<html><body>");
        out.println("<h2>Student Registration Details</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Course:</strong> " + course + "</p>");
        out.println("</body></html>");
    }
}
