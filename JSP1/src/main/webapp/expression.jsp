<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Result<h2> <%=90+10 %>
	<%
	int a=9;
	int b=8;
	%>
	
	<h2>Sum= <%= a+b %>
	<%!
		int square(int x)
		{
			return x*x;
		}
	%> </h2>
	
	<h2>Square is = <%=square(5) %></h2>
	
	<%!
	
	String checkAge(int age)
	{
		if(age >18){
			return "eligible";
		} else {
			return "not eligible";
		}
	}
	%>
	
	<h2>Result :  <%= checkAge(20) %> </h2>
</body>
</html>