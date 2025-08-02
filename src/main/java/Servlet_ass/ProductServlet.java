package Servlet_ass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String product = request.getParameter("product");
        int price = 0;

        if ("Laptop".equals(product)) price = 50000;
        else if ("Smartphone".equals(product)) price = 30000;
        else if ("Tablet".equals(product)) price = 20000;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Enter Quantity</title></head><body>");
        out.println("<h2>Enter Quantity for " + product + "</h2>");
        out.println("<form method='post' action='OrderServlet'>");
        // hidden fields to transmit product and price
        out.println("<input type='hidden' name='product' value='" + product + "'/>");
        out.println("<input type='hidden' name='price' value='" + price + "'/>");
        out.println("Quantity: <input type='number' name='quantity' min='1' value='1' required/>");
        out.println("<br><br><input type='submit' value='Get Total'/>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
