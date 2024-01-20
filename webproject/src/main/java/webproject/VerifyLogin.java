package webproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VerifyLogin extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=req.getParameter("mail");
		String password=req.getParameter("pass");
		VerifyLoginDao v=new VerifyLoginDao();
		PrintWriter out=res.getWriter();
		 
		if(v.verifyLoginByEmail(email, password))
		{
			out.println("<h1 style=color:green>Login Successful!!!</h1>");
		}
		else
		{
			out.println("<h1 style=color:red>Invalid Credentials</h1>");
		}
		
		}

}
