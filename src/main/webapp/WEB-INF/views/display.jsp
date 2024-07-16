<%--
  Created by IntelliJ IDEA.
  User: WIN 10
  Date: 15/07/2024
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/caculator" method="post">
    <input type="text" name="num1">
    <input type="text" name="num2"><br><br>
    <button type="submit" value="add" name="operation">Add</button>
    <button type="submit" value="sub" name="operation">Sub</button>
    <button type="submit" value="multi" name="operation">Multi</button>
    <button type="submit" value="divi" name="operation">Divi</button>
</form>
<h3 style="color: red" name="result">Result:${result}</h3>

</body>
</html>
