package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
				throws ServletException,IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username = request.getParameter("username");
		Cookie ck=new Cookie("username",username);
		response.addCookie(ck);
		out.println("<h2>Cookie Created Successfully</h2>");
		out.println("<h3>Hello ,"+username+"</h3>");
	}
}
