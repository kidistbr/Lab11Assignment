<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Calculator" %>
</h1>
<br/>
<form action="CalculatorServlet" method="post">
    <input type="number" name="number1" step="any"> +
    <input type="number" name="number2" step="any">
    <br/>
    <input type="number" name="number3" step="any"> x
    <input type="number" name="number4" step="any">
    <br/>
    <input type="submit">
</form></body>
</html>