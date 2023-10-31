<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form action="RegisterServlet" method="post">
        <label for="userId">User ID:</label>
        <input type="text" name="userId" id="userId" required><br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required><br>
        <label for="accountName">Account Name:</label>
        <input type="text" name="accountName" id="accountName" required><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
