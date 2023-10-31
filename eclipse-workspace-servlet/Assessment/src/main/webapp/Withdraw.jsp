<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
    <h2>Withdraw Money</h2>
    <form action="WithdrawServlet" method="post">
        Enter the Amount to Withdraw: <input type="number" name="withdrawAmount"><br>
        <input type="submit" value="Withdraw">
    </form>
</body>
</html>
