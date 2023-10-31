<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate Login</title>
</head>
<body>
<%
String user=request.getParameter("uname");
String password=request.getParameter("pass");
 
if(user.equals("Hari") && password.equals("123")) {
	session.setAttribute("user", user);
	%>
	<h2>Welcome to <%=user%></h2><br/>
 
	<a href='/JSPz/Home.jsp'>Click to home page</a>
	<%
	}
else{
	%>
	<h3 style="color:red">Invalid credentials </h3>
	<a href="/jsp/Login.html">Click re-login</a>
	<%
	}%>
</body>
</html>