<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logout</title>
</head>
<body>
    <h1>Logout</h1>
    <%-- Check if the user is logged in --%>
    <% if (session.getAttribute("username") != null) { %>
        <p>You are logged in as: <%= session.getAttribute("username") %></p>
        <form action="logout" method="post">
            <input type="submit" value="Logout">
        </form>
    <% } else { %>
        <p>You are not logged in.</p>
        <p><a href="login.jsp">Click to Login</a></p>
    <% } %>
</body>
</html>
