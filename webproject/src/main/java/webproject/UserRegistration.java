package webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserRegistration extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		String output="USER REGISTRATION DONE !!!";
		String name=req.getParameter("fname")+" "+req.getParameter("lname");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		String mobile=req.getParameter("mobile");
		String username=req.getParameter("username");
		String password=req.getParameter("pass");

       PrintWriter out=res.getWriter();
       out.println("<center><h1>"+output+"</h1><br><br>");
       out.println("<h2> Name		: "+name+"<br><br>");
       out.println("Dob			: "+dob+"<br><br>");
       out.println("Address		: "+address+"<br><br>");
       out.println("Mobile		: "+mobile+"<br><br>");
       out.println("Username	: "+username+"<br><br>");
       out.println("Password	: "+password+"<br><br></h2></center>");
       
    

		
	}

}
