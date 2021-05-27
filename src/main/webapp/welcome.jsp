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
    <link rel="stylesheet" href="css/styles.css">
    <script src="js/script.js"></script>
<%--    What is 1 + 1? <%= 1 + 1 %> would be the answer <!-- '=' returns value -->--%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<%--incorporates partial file (file doesn't belong to anything, also has to be in partials folder)--%>

<%--running arbitrary java code--%>
<%! int count = 0; %>  <%--the '!' is for initiating instances, must be separate so we can continuously reassign it--%>
<%
    count++;
%>
    <h1>Hello, Marco</h1>
    <p>What is 1 + 1? <%= 1 + 1 %> would be the answer <!-- '=' returns function value --></p>
    <p>This page has been requested using the method <%=request.getMethod()%></p>
    <p>Path: <%=request.getRequestURL()%></p>
    <p>Name parameter in the query string <%=request.getParameter("name")%></p>

    <div>This page has been visited <%= count %></div>
</body>
</html>
