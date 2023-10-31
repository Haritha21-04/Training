<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Details</title>
</head>
<body>
    <h1>Doctor Details</h1>
    <table>
        <tr>
            <th>ID:</th>
            <td>${doctor.id}</td>
        </tr>
        <tr>
            <th>Full Name:</th>
            <td>${doctor.fullName}</td>
        </tr>
        <tr>
            <th>Date of Birth:</th>
            <td>${doctor.dob}</td>
        </tr>
        <tr>
            <th>Qualification:</th>
            <td>${doctor.qualification}</td>
        </tr>
        <tr>
            <th>Specialist:</th>
            <td>${doctor.specialist}</td>
        </tr>
        <tr>
            <th>Email:</th>
            <td>${doctor.email}</td>
        </tr>
        <tr>
            <th>Mobile Number:</th>
            <td>${doctor.mobNo}</td>
        </tr>
    </table>
</body>
</html>
