<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Doctors</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <header>
        <h1>View Doctors</h1>
    </header>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="about.jsp">About Us</a></li>
            <li><a href="services.jsp">Services</a></li>
            <li><a href="contact.jsp">Contact Us</a></li>
        </ul>
    </nav>
    <main>
        <section>
            <h2>Doctors List</h2>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Full Name</th>
                    <th>Specialist</th>
                    <th>Email</th>
                    <th>Mobile Number</th>
                </tr>
                <c:forEach items="${doctorList}" var="doctor">
                    <tr>
                        <td>${doctor.id}</td>
                        <td>${doctor.fullName}</td>
                        <td>${doctor.specialist}</td>
                        <td>${doctor.email}</td>
                        <td>${doctor.mobNo}</td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Our Website. All rights reserved.</p>
    </footer>
</body>
</html>
