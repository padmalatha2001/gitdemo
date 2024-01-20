package jspsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao{
	private Connection con;
	private PreparedStatement ps; 
	private ResultSet rs;
	
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean verifyuser(String email,String password){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","padma");
	    ps=con.prepareStatement("select * from user where email=? and password=?");
	    ps.setString(1,email);
	    ps.setString(2, password);
	    rs=ps.executeQuery();
	    if(rs.next())
	    {
	    	return true;
	    }
	    
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return false;
	}
}
