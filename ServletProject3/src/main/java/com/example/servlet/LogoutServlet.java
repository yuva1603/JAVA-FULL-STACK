package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie ck=new Cookie("user","");
		ck.setMaxAge(0);
		response.addCookie(ck);
		
		out.println("<h3>You are Logged Out </h3>");
		out.println("<a href='" + request.getContextPath() +"/login.html'>Login Again</a>");
	}

}
