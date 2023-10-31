<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Validate Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<%
String user = request.getParameter("uname");
String password = request.getParameter("pass");
 
if (user != null && password != null) {
    if (user.equals("admin") && password.equals("123")) {
        session.setAttribute("user", "admin");
%>
        <h2>Welcome Admin...!!</h2><br/>
        <a href='AddProducts.html'>Click to product page</a>
<%
    } else {
        session.setAttribute("user", "456");
%>
        <h2>Welcome User...!!</h2><br/>
        <a href='ViewData.html'>Click to product page</a>
<%
    }
} else {
%>
    <form action="Login.jsp" method="post">
        <label for="uname">Username:</label>
        <input type="text" name="uname" id="uname" required><br/><br/>
 
        <label for="pass">Password:</label>
        <input type="password" name="pass" id="pass" required><br/><br/>
        
        <input type="submit" value="Login">
    </form>
<%
}
%>
 
</body>
</html>
 