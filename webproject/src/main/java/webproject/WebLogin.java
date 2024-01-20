package webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WebLogin extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=res.getWriter();
		String email=req.getParameter("mail");
		String password=req.getParameter("pass");
		
		out.println("<context><h2>"+email+"</h2></context>");
		out.println("<context><h2>"+password+"</h2></context>");
		out.println("LOGIN SUCCESSFUL");	
		
		
	}

}
