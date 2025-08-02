package Servlet_ass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String marks = request.getParameter("marks");

        // Set as request attributes
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        // Forward to GradeServlet
        RequestDispatcher rd = request.getRequestDispatcher("GradeServlet");
        rd.forward(request, response);
    }
}
