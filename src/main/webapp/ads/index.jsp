<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--^^^needs this for the c tag to work and run the for each loop--%>

<%--
  Created by IntelliJ IDEA.
  User: kenyonluce
  Date: 6/1/21
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Testing</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p>Price: $ ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
