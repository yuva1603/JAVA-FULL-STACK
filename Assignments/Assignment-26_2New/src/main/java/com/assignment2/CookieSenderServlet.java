package com.assignment2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieSenderServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("user");
		String age=request.getParameter((String)"age");
		
		if((username !=null)&&(age != null)) {
		Cookie ck=new Cookie("username",username);
		ck.setMaxAge(10*60);//setting time limit 10 minutes
		ck.setPath(request.getContextPath());
		response.addCookie(ck);
		Cookie ck1=new Cookie("age",age);
		ck1.setMaxAge(10*60);
		response.addCookie(ck1);
		ck1.setPath(request.getContextPath());
		
		out.println("<h2>Cookie Created Successfuly </h2>");
		out.println("<h3>Hello There ,"+username+"</h3>");
		out.println("See Your Age Via Cookies");
		out.println("<a href='"+request.getContextPath()+"/CookieReadServlet'>Cookies</a>");
		} else {
			out.println("<h3>Enter Valid Credential</h3>");
		}
	}
}
