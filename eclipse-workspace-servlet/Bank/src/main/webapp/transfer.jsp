<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Fund Transfer</title>
</head>
<body>
    <h1>Fund Transfer</h1>
    <form action="TransferServlet" method="post">
        <label for="destinationAccount">Destination Account:</label>
        <input type="text" name="destinationAccount" id="destinationAccount" required><br>
        <label for="amount">Amount to Transfer:</label>
        <input type="number" name="amount" id="amount" required><br>
        <input type="submit" value="Transfer">
    </form>
</body>
</html>
    