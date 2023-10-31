<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="Product" %> <!-- Import the Product class -->

<!DOCTYPE html>
<html>
<head>
    <title>Product Listing</title>
</head>
<body>
    <h1>Product Listing</h1>
    
    <% 
        // Assuming you have a list of products stored in a variable called "products" in your servlet
        List<Product> products = (List<Product>) request.getAttribute("products");
        
        if (products != null) {
            for (Product product : products) {
    %>
                <div class="product">
                    <h2><%= product.getName() %></h2>
                    <p>Price: $<%= product.getPrice() %></p>
                    <p><%= product.getDescription() %></p>
                    <form action="AddToCartServlet" method="post">
                        <input type="hidden" name="productId" value="<%= product.getId() %>">
                        <input type="submit" value="Add to Cart">
                    </form>
                </div>
    <%
            }
        }
    %>
</body>
</html>
