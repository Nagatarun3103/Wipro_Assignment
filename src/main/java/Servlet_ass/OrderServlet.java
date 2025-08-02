package Servlet_ass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String product = request.getParameter("product");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int total = price * quantity;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Order Receipt</title></head><body>");
        out.println("<h2>Order Receipt</h2>");
        out.println("<table border='1' cellpadding='8'>");
        out.println("<tr><td>Product</td><td>" + product + "</td></tr>");
        out.println("<tr><td>Unit Price</td><td>" + price + "</td></tr>");
        out.println("<tr><td>Quantity</td><td>" + quantity + "</td></tr>");
        out.println("<tr><td><b>Total</b></td><td><b>" + total + "</b></td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}
