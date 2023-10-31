<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Details</title>
</head>
<body>
    <h2>Insert Details</h2>
    <form action="InsertDetailsServlet" method="post">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId"><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br>
        
        <label for="accountName">Account Name:</label>
        <input type="text" id="accountName" name="accountName"><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
