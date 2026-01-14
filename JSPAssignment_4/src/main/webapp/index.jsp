<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>

<h2>Calculator</h2>

<form method="post">
    <input type="number" name="input1" placeholder="Input 1" required>

    <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
        <option value="%">Modulus</option>
    </select>

    <input type="number" name="input2" placeholder="Input 2" required>
    <input type="submit" value="Get Results">
</form>

<%
String c = request.getParameter("input1");
String d = request.getParameter("input2");
String op = request.getParameter("operator");

if(c != null && d != null && op != null) {

    int a = Integer.parseInt(c);
    int b = Integer.parseInt(d);
    double res = 0;
    String err = null;

    if(op.equals("+")) {
        res = a + b;
    }
    else if(op.equals("-")) {
        res = a - b;
    }
    else if(op.equals("*")) {
        res = a * b;
    }
    else if(op.equals("/")) {
        if(b == 0) {
            err = "Cannot divide by zero";
        } else {
            res = (double)a / b;
        }
    }
    else if(op.equals("%")) {
        res = a % b;
    }

    if(err != null) {
%>
        <h2 style="color:red"><%= err %></h2>
<%
    } else {
%>
        <h2>Result: <%= res %></h2>
<%
    }
}
%>

</body>
</html>
