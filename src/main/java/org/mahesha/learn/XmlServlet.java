package org.mahesha.learn;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {
	
	public void init() {
		System.out.println("This is run first when the application is called!");
		//We can configure database connection or anything we needs to be setup once. 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("This is xml servlet");
		response.setContentType("text/html");
		response.getWriter().append("<h1> This is custom xml Servlet class </h1>");
		response.getWriter().append(request.getParameter("user"));
		String userName = request.getParameter("user");
		
		
		//Session Object will help to keep track of the parameter
		
		HttpSession session = request.getSession();
		if(userName != "" && userName != null)
			session.setAttribute("savedUserName",userName);
		
		response.getWriter().println("Request Parameter: " + userName);
		response.getWriter().println("Session parameter: " + (String) session.getAttribute("savedUserName"));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("This is in POST Method");
		response.setContentType("text/html");
		response.getWriter().append("<h1> This is custom xml Servlet class </h1>");
		response.getWriter().append(request.getParameter("username")).append("    ");
		response.getWriter().append(request.getParameter("fullname"));
		System.out.println("Name " + request.getParameter("username") + "      " + request.getParameter("fullname"));
		
	}
}
