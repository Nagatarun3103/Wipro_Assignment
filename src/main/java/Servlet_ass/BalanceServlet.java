package Servlet_ass;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            double balance = (Double) session.getAttribute("balance");
            out.println("<h2>Welcome, " + name + "</h2>");
            out.println("<p>Your balance: $" + balance + "</p>");
            out.println("<form method='post' action='logout'><input type='submit' value='Logout'></form>");
        } else {
            out.println("<p>Session expired or not logged in. <a href='login.html'>Login again</a></p>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
