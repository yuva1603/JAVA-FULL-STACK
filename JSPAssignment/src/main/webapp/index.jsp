<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>String Length</title>
</head>
<body>

<form method="post">
    <input type="text" name="name" placeholder="Enter the Name : ">
    <input type="submit" value="Register">
</form>

<h2>Lets See the length of variable</h2>

<%
String name = request.getParameter("name");

if(name != null) {
    int count = 0;
    for(int i = 0; i < name.length(); i++) {
        count++;
    }
%>

<h2>Given Input is: <%= name %></h2>
<h2>The length of input is: <%= count %></h2>

<%
}
%>



<h2>Random Number</h2>

<%= (int)(Math.random() * 100) %>


</body>
</html>
