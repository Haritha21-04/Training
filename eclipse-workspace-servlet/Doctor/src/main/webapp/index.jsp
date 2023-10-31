<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor, User, and Specialist Details</title>
</head>
<body>
    <header>
        <h1>Welcome to ABCD Hospital</h1>
    </header>
    <nav>
        <ul>
            <li><a href="doctor.jsp">DOCTOR</a></li>
            <li><a href="services.jsp">Services</a></li>
            <li><a href="contact.jsp">Contact Us</a></li>
        </ul>
    </nav>
    <main>
        <section>
            <h2>Doctors</h2>
            <ul>
                <c:forEach items="${doctors}" var="doctor">
                    <li>${doctor.fullName} - ${doctor.specialist}</li>
                </c:forEach>
            </ul>
        </section>
        <section>
            <h2>Users</h2>
            <ul>
                <c:forEach items="${users}" var="user">
                    <li>${user.fullName} - ${user.email}</li>
                </c:forEach>
            </ul>
        </section>
        <section>
            <h2>Specialists</h2>
            <ul>
                <c:forEach items="${specialists}" var="specialist">
                    <li>${specialist.specialistName}</li>
                </c:forEach>
            </ul>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Our Website. All rights reserved.</p>
    </footer>
</body>
</html>
