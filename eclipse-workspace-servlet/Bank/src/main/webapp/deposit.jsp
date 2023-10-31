<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
    <title>Deposit Money</title>
</head>
<body>
    <h1>Deposit Money</h1>
    <form action="DepositServlet" method="post">
        <label for="amount">Amount to Deposit:</label>
        <input type="number" name="amount" id="amount" required><br>
        <input type="submit" value="Deposit">
    </form>
</body>
</html>
