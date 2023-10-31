package shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the product ID from the request
        String productId = request.getParameter("productId");

        // Check if the cartItems attribute already exists in the session, if not, create it
        HttpSession session = request.getSession();
        @SuppressWarnings("unchecked")
		ArrayList<String> cartItems = (ArrayList<String>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
            session.setAttribute("cartItems", cartItems);
        }

        // Add the product ID to the user's cart
        cartItems.add(productId);

        // Redirect back to the product listing page or wherever you want
        response.sendRedirect("Product.jsp");
    }
}
