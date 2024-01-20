package jdbcsteps;

import java.sql.*;
public class ExecuteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("started");
       String Query="select * from book";
       try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdb","root","padma");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
