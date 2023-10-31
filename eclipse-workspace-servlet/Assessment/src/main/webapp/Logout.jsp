<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
    
    session.invalidate();
%>

<html>
<head>
    <title>Logout or Exit</title>
</head>
<body>
    <h2>You have been successfully logged out.</h2>
    <a href="Login.jsp">Login Again</a>
</body>
</html>
