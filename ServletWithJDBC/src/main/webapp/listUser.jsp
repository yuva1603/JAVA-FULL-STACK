<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr><th>ID</th><th>Name</th><th>Email</th></tr>
	<%
	ResultSet rs=(ResultSet)request.getAttribute("data");
	while(rs.next()){
	%>
	<tr>
	<td><%=rs.getInt(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td>
	<a href="editUser?id=<%=rs.getInt(1) %>">Edit</a>
	<a href="deleteUser?id=<%=rs.getInt(1) %>">Delete</a>
	</td>
	</tr>
	<% } %>
	</table>
</body>
</html>