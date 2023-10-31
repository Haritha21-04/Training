<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }
 
        .error-container {
            margin: 5% auto;
            padding: 20px;
            border: 1px solid #e0e0e0;
            background-color: #f9f9f9;
            max-width: 400px;
        }
 
        h2 {
            color: #e53935;
        }
 
        .login-link {
            text-decoration: none;
            color: #1976D2;
        }
    </style>
    
</head>
<body>
    <h1>Admin Login</h1>
    
    <form action="/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="user" required><br><br>
 
        <label for="password">Password:</label>
        <input type="password" id="password" name="pass" required><br><br>
 
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
    
</body>
</html>