package Servlet_ass;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accountNo = request.getParameter("accountNo");
        String password = request.getParameter("password");
        
        
        if ("998285".equals(accountNo) && "pass".equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("accountNo", accountNo);
            session.setAttribute("name", "John Doe"); 
            session.setAttribute("balance", 2500.0);  // Example

            response.sendRedirect("balance");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<p style='color:red'>Invalid account or password.</p>");
            out.println("<a href='login.html'>Try again</a>");
        }
    }
}
