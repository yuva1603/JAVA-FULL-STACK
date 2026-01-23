<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateUserServlet" method="post">
		<input type="hidden" name="id" value="1"/>
		<input type="text" name="name" placeholder="Enter your Name : " required"><br/><br/>
		<input type="text" name="email" placeholder="Enter the email : " required"><br/><br/>
		<input type="submit" value="Update">
	</form>
</body>
</html>