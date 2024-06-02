package royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("called......");
		
		
		//request
		String firstName=request.getParameter("firstName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		out.print("<html><body>");
		out.print("firstName => "+firstName);
		out.print("email =>"+email);
		out.print("password =>"+password);
		out.print("<html><body>");
		
		
		
		
	}	
}
