package webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/VerifyLoginByMobile")
public class VerifyLoginByMobile extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mobile=req.getParameter("mobile");
		String password=req.getParameter("pass");
		VerifyLoginDao v=new VerifyLoginDao();
		PrintWriter out=res.getWriter();
		 
		if(v.verifyLoginByMobile(mobile, password))
		{
			out.println("<h1 style=color:green>Login Successful!!!</h1>");
		}
		else
		{
			out.println("<h1 style=color:red>Invalid Credentials</h1>");
		}
		
	}

}
