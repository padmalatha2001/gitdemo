package jdbcsteps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedStatementj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //String query="update advancejava.student12 set depart=? where sid=? and sname=?";
		try {
			Connection connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","padma");
		    PreparedStatement ps=connect.prepareStatement("update student12 set depart=? where sid=? AND sname=?");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter sid");
		    ps.setInt(1,sc.nextInt());
		    System.out.println("Enter sname");
		    ps.setString(2,sc.next());
		    System.out.println("Enter Department");
		    ps.setString(3,sc.next());
		    int re=ps.executeUpdate();
		    if(re>0)
		    	System.out.println("Record Updated");
		    else
		    	System.out.println("Invalid Credentials");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
