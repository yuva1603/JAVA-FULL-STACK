<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User </title>
</head>
<body>
	<%
	ResultSet rs = (ResultSet)request.getAttribute("user");
	rs.next();
	%>
	
	<form action="updateUser" method="post">
		<input type="hidden" name="id" value="<%=rs.getInt(1) %>">
		Name : <input type="text" name="name" value="<%=rs.getString(2) %>"><br/>
		Email : <input type="text" name="email" value="<%=rs.getString(3) %>"><br/>
		<input type="submit" value="Update">
	</form>
	
</body>
</html>