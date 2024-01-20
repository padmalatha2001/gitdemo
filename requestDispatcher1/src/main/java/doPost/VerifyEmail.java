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

import doPost.UserDao;

@WebServlet("/VerifyEmail")
public class VerifyEmail extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		String email=req.getParameter("mail");
		UserDao u=new UserDao();
		RequestDispatcher dis;
		
		HttpSession session=req.getSession();
		session.setAttribute("usermail", email);
		session.setMaxInactiveInterval(10);
		if(u.verifyUserEmail(email))
		{
			dis=req.getRequestDispatcher("VerifyPassword.html");
			 dis.forward(req,res);
		}
		if(u.verifyUserEmail(email))
		{
			dis=req.getRequestDispatcher("VerifyPassword.html");
			 dis.forward(req,res);
		}
		else
		{
			out.println("<h1 style=color:red>Invalid Email!!!</h1>");
			dis=req.getRequestDispatcher("VerifyEmail.html");
			dis.include(req,res);
		}
		
	}

}
