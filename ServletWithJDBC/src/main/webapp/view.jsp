<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>
	<h2>User List</h2>
	<table border="1">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Email</th>
	</tr>
	<% 
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb","root","Yuva@1603");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from user");
		while(rs.next()) {
	%>
		<tr>
		<td><%=rs.getInt("id") %></td>
		<td><%=rs.getString("name") %></td>
		<td><%=rs.getString("email") %></td>
		</tr>
		<% 
		}
		rs.close();
		st.close();
		con.close();
	} 
	catch(Exception e){
		e.printStackTrace();
	}
		%>
	</table>
</body>
</html>