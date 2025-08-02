package Servlet_ass;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String profession = request.getParameter("profession");
        String married = request.getParameter("married") != null ? "Yes" : "No";
        String note = request.getParameter("note");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Registration Result</title></head><body>");
        out.println("<h1>Registration Details</h1>");
        out.println("<b>Full Name:</b> " + fullname + "<br>");
        out.println("<b>Email:</b> " + email + "<br>");
        out.println("<b>Password:</b> " + password + "<br>");
        out.println("<b>Birthday:</b> " + birthday + "<br>");
        out.println("<b>Gender:</b> " + gender + "<br>");
        out.println("<b>Profession:</b> " + profession + "<br>");
        out.println("<b>Married?:</b> " + married + "<br>");
        out.println("<b>Note:</b> " + note + "<br>");
        out.println("</body></html>");
    }
}
//http://localhost:8080/Servlet_Assign/index.jsp