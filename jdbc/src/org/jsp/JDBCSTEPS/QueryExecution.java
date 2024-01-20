package org.jsp.JDBCSTEPS;

import java.sql.*;
import java.lang.*;
public class QueryExecution{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               System.out.println("started");
		String url="jdbc:mysql://localhost:3306?user=root&password=padma";
		try {
			  
			//Class.forName("com.mysql.jdbc.Driver");
		   	Connection con=DriverManager.getConnection(url);
			Statement smt=con.createStatement();
	           smt.executeUpdate("delete from advancejava.employee where eid=2");
	          // smt.executeUpdate("insert into advancejava.employee values(3,'raj',50000,20)");
	           smt.executeUpdate("update advancejava.employee set eid=4 where ename='raj'");
			ResultSet rs=smt.executeQuery("select * from advancejava.employee");
			System.out.println("executed");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
