<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/addContent">
 
<label for="localCurrency">Local Currency:</label>
        <input type="text" id="localCurrency" name="localCurrency" required>
        <br>
 
        <label for="foreignCurrency">Foreign Currency:</label>
        <input type="text" id="foreignCurrency" name="foreignCurrency" required>
        <br>
 
        
        <button type="submit">Update</button>
 
</form>
</body>
</html>
