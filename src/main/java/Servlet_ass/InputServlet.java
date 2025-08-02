package Servlet_ass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String marks = request.getParameter("marks");

        // Pass data as request attributes
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        // Forward to GradeServlet (same as target URL pattern in web.xml)
        RequestDispatcher dispatcher = request.getRequestDispatcher("GradeServlet");
        dispatcher.forward(request, response);
    }
}
