<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="formularz" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Registration</h1>
<p style="color: dimgray;">${welcomeMessage}</p>
<ul>
    <li>
        <a href="/patients">Home</a>
    </li>
</ul>

<formularz:form modelAttribute="patient">
    <table>
        <tr>
            <td colspan="2" style="color:red;"><formularz:errors path="fname"></formularz:errors> </td>
        </tr>
        <tr>
            <td>
                <spring:message code="name.first" />
            </td>
            <td>
                <formularz:input path="fname"  />
            </td>
        </tr>
        <tr>
            <td colspan="2" style="color:red;"><formularz:errors path="lname"></formularz:errors> </td>
        </tr>
        <tr>
            <td>
                <spring:message code="name.last" />
            </td>
            <td>
                <formularz:input path="lname" />
            </td>
        </tr>
        <tr>
            <td colspan="2" style="color:red;"><formularz:errors path="age"></formularz:errors> </td>
        </tr>
        <tr>
            <td>
                <spring:message code="age" />
            </td>
            <td>
                <formularz:input path="age" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message code="register" /> " />
            </td>
        </tr>
    </table>
</formularz:form>

</body>
</html>
