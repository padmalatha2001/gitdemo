package doPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import   doPost.UserDao;

@WebServlet("/VerifyPassword")
public class VerifyPassword extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		String pass=req.getParameter("pass");
		UserDao u=new UserDao();
		RequestDispatcher dis;
		HttpSession session=req.getSession();
		String mail=(String) session.getAttribute("usermail");
		if(mail!=null)
		{
		    if(u.verifyUserEmailandPassword(mail,pass))
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
		else
		{
			 out.println("<marqee><h1 style=color:red>Session Timeout!!!</h1></marqee>");
		}
	}
}
