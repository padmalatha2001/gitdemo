package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FirstHttpServlet")
public class FirstHttpServlet extends HttpServlet{
    
	/*protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		
			PrintWriter out=res.getWriter();
			out.println("<h1>FirstHttpServletClasss Successful</h1>");
			
	}*/
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		
			PrintWriter out=res.getWriter();
			out.println("<h1>FirstHttpServletClasss Successful</h1>");
			
	}
	
	
}
