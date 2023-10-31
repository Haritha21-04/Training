<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
    <h2>Fund Transfer</h2>
    <form action="TransferServlet" method="post">
        Destination Account: <input type="text" name="destinationAccount"><br>
        Enter the Amount to Transfer: <input type="number" name="transferAmount"><br>
        <input type="submit" value="Transfer Funds">
    </form>
</body>
</html>
