package jdbcsteps;
import java.sql.*;
public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String query="select * from booksdb.book";
		//String query1="insert into book values(4,'DatabaseManagement','Syn Wilson',500)";
		String query1="update book set price=800 where book_id=4";
		try {
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdb","root","padma");
			Statement stmt=connect.createStatement();
			int n=stmt.executeUpdate(query1);
		    ResultSet rs=stmt.executeQuery(query);
		    System.out.println("Books Details");
		   
		    while(rs.next())
		    {    System.out.println("-------------------------------------------");
		    	System.out.println("BOOK ID    :"+rs.getInt(1));
		    	System.out.println("BOOK TITLE :"+rs.getString("title"));
		    	System.out.println("BOOK AUTHOR:"+rs.getString(3));
		    	System.out.println("BOOK PRICE :"+rs.getInt(4));
		    }
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
