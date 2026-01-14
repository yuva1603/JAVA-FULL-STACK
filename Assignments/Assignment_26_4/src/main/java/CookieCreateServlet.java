

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieCreateServlet
 */
//@WebServlet("/CookieCreateServlet")
public class CookieCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String resp=request.getParameter("check");
		
		Cookie ck=new Cookie("username",username);
		response.addCookie(ck);
		ck.setMaxAge(60*60);
		
		Cookie ck1=new Cookie("email",email);
		response.addCookie(ck1);
		ck.setMaxAge(60*60);

		Cookie ck2=new Cookie("check",resp);
		response.addCookie(ck2);
		ck.setMaxAge(60*60);
		out.println("<h2>Cookies has been Created</h2>");
		out.println("<a href='"+request.getContextPath()+"/CookieViewServlet'>View Cookie Here</a>");
	}

}
