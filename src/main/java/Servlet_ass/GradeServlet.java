package Servlet_ass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

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
            grade = "Invalid marks input!";
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Grade Result</title></head><body>");
        out.println("<h2>Result for " + name + "</h2>");
        out.println("<p>Marks: " + marksStr + "</p>");
        out.println("<p>Grade: <b>" + grade + "</b></p>");
        out.println("</body></html>");
    }
}
