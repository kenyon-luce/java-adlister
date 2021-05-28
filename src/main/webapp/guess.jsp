<%--
  Created by IntelliJ IDEA.
  User: kenyonluce
  Date: 5/28/21
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="guess-outcome.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/guess" method="POST">
    <div class="form-group">
        <label for="guess">Guess a number between 1 and 3</label>
        <input id="guess" name="guess" class="form-control" type="text">
    </div>
    <input type="submit" class="btn btn-primary btn-block">
</form>
</body>
</html>
