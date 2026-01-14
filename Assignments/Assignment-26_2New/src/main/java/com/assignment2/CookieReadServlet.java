package com.assignment2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieReadServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	        throws ServletException,IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    Cookie[] cookies = request.getCookies();
	    String user = null;
	    String age = null;

	    if(cookies != null) {
	        for(Cookie c : cookies) {
	            if(c.getName().equals("username")) {
	                user = c.getValue();
	            }
	            if(c.getName().equals("age")) {
	                age = c.getValue();
	            }
	        }
	    }

	    if(user != null && age != null){
	        out.println("<h2>Welcome, " + user + "</h2>");
	        out.println("<h3>Your Age is " + age + "</h3>");
	    } else {
	        out.println("<h3>No Cookies Found</h3>");
	    }
	}

}
