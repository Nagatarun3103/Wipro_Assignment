package Servlet_ass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = (String) request.getAttribute("name");
        String marksStr = (String) request.getAttribute("marks");
        int marks = 0;
        String grade;

        try {
            marks = Integer.parseInt(marksStr);
            if (marks >= 90) grade = "A+";
            else if (marks >= 80) grade = "A";
            else if (marks >= 70) grade = "B";
            else if (marks >= 60) grade = "C";
            else if (marks >= 50) grade = "D";
            else grade = "Fail";
        } catch (Exception e) {
            grade = "Invalid marks";
        }

        // Set attributes for JSP and forward
        request.setAttribute("name", name);
        request.setAttribute("marks", marksStr);
        request.setAttribute("grade", grade);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/gradeResult.jsp");
        dispatcher.forward(request, response);
    }
}
