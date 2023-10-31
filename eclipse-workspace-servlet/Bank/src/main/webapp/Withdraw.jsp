<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>Withdraw Money</title>
</head>
<body>
    <h1>Withdraw Money</h1>
    <form action="WithdrawServlet" method="post">
        <label for="amount">Amount to Withdraw:</label>
        <input type="number" name="withdrawAmount" id="amount" required><br>
        <input type="submit" value="Withdraw">
    </form>
</body>
</html>
