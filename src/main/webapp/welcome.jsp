<%--
  Created by IntelliJ IDEA.
  User: kenyonluce
  Date: 5/27/21
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%--JSP comments (<%-%>) will not appear in the html source--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome, Marco</title>
    <!--this comment will be seen in the html source-->

<%--    What is 1 + 1? <%= 1 + 1 %> would be the answer <!-- '=' returns value -->--%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>

<%--running arbitrary java code--%>
<%! int count = 0; %>  <%--the '!' is for initiating instances, must be separate so we can continuously reassign it--%>
<%
    count++;
%>
    <h1>Hello, Marco</h1>
    <p>What is 1 + 1? <%= 1 + 1 %> would be the answer <!-- '=' returns function value --></p>
    <div>This page has been visited <%= count %></div>
</body>
</html>
