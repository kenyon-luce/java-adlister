<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kenyonluce
  Date: 5/27/21
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("POST")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin") & password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/login.jsp" method="POST">
        <label for="username">Username</label><br>
        <input type="text" id = username name="username"><br>

        <label for="password">Password</label><br>
        <input type="text" id = password name="password"><br>

        <input type="submit" value="Submit">
    </form>

<%--    <c:choose>--%>
<%--        <c:when test="username.equals(admin)">--%>
<%--            --%>
<%--        </c:when>--%>
<%--    </c:choose>--%>
</body>
</html>
