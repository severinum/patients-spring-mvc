<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="formularz" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Patients - Home</title>
</head>
<body>
<h1>Patients</h1>
<p style="color: dimgray;">${welcomeMessage}</p>
<ul>
    <li>
        <a href="register">New Patient</a>
    </li>
    <li>
        <a href="${manualPdf}">Get PDF file</a>
    </li>
    <li>
        <a href="patient.html">Get Patient via jQuery</a>
    </li>
</ul>
</body>
</html>