<%--
  Created by IntelliJ IDEA.
  User: nihao
  Date: 2023-11-01
  Time: 오후 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
    <h2>User registered successfully!</h2>

    <li>User name: ${webUser.userName}</li>
    <li>First Name: ${webUser.firstName}</li>
    <li>Last Name: ${webUser.lastName}</li>
    <li>Email: ${webUser.email}</li>

<a href="${pageContext.request.contextPath}/login">Login with New User</a>
</body>
</html>
