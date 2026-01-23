package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Simple Validation 
		if(username.equals("admin") && password.equals("1234")) {
			
			Cookie ck=new Cookie("user",username);
			ck.setMaxAge(60 * 60); // 1 hour (Persistent) (mins * secs)
			response.addCookie(ck);
			
			out.println("<h3>Login Successful</h3>");
			out.println("<a href='" +request.getContextPath() +"/ProfileServlet'>Go to Profile</a>");
			
		} else {
			out.println("<h3>Invalid Login</h3>");
			out.println("<a href='" +request.getContextPath() +"/login.html'>Try Again </a>");
		}
	}

}
