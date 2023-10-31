
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h1>Shopping Cart</h1>
    
    <c:choose>
        <c:when test="${empty sessionScope.cartItems}">
            <p>Your cart is empty.</p>
        </c:when>
        <c:otherwise>
            <ul>
                <c:forEach items="${sessionScope.cartItems}" var="productId">
                    <li>Product ID: ${productId}</li>
                </c:forEach>
            </ul>
        </c:otherwise>
    </c:choose>
</body>
</html>
