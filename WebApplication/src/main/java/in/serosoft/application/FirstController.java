package in.serosoft.application;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String rno=request.getParameter("rno");
		System.out.println(rno);
		ManageResultDAO manage=new ManageResultDAOImpl();
		StudentDetails student=manage.findById(rno);
		System.out.println(student);
		
		request.setAttribute("student", student);
		RequestDispatcher rd=request.getRequestDispatcher("Result.jsp");
		rd.forward(request, response);
	
	}
}
