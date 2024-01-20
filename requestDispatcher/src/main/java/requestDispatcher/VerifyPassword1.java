package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/VerifyPassword1")
public class VerifyPassword1 extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		String pass=req.getParameter("pass");
		UserDao u=new UserDao();
		RequestDispatcher dis;
		
		if(u.verifyUserPassword(pass))
		{
			out.println("<h1 style=color:green>Login Successful!!!</h1>");	
		     
			
		}
		else
		{
			out.println("<h1 style=color:red>Invalid Password!!!</h1>");
			dis=req.getRequestDispatcher("VerifyPassword.html");
			dis.include(req,res);
		}
		
	}
}
