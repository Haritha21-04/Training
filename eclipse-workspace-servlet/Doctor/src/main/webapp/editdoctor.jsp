<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Doctor</title>
</head>
<body>
    <h1>Edit Doctor</h1>
    <form action="updateDoctor" method="POST">
        <input type="hidden" name="id" value="${doctor.id}">
        
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" value="${doctor.fullName}" required><br>
        
        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" value="${doctor.dob}" required><br>
        
        <label for="qualification">Qualification:</label>
        <input type="text" id="qualification" name="qualification" value="${doctor.qualification}" required><br>
        
        <label for="specialist">Specialist:</label>
        <input type="text" id="specialist" name="specialist" value="${doctor.specialist}" required><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${doctor.email}" required><br>
        
        <label for="mobNo">Mobile Number:</label>
        <input type="tel" id="mobNo" name="mobNo" value="${doctor.mobNo}" required><br>
        
        <input type="submit" value="Save">
    </form>
</body>
</html>
    