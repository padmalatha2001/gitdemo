package webproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletResponse;



public class VerifyLoginDao {
	private Connection con;
    private PreparedStatement ps;
    private String driver="com.mysql.jdbc.Driver";
public boolean verifyLoginByEmail(String mail,String pass) {
	
	boolean value=false;
     try {
    
    	 Class.forName(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","padma");
		 ps=con.prepareStatement("select * from user where email=? and password=?");
		ps.setString(1,mail);
		ps.setString(2,pass);
        ResultSet re=ps.executeQuery();
        
		if(re.next())
		{
		    value= true;
		}
		else
		{
			value= false;
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return value;
  }


public boolean verifyLoginByMobile(String mobile,String pass) {
	
	boolean value=false;
     try {
    
    	 Class.forName(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","padma");
		 ps=con.prepareStatement("select * from user where password=? and  moblie=?");
		ps.setString(2,mobile);
		ps.setString(1,pass);
        ResultSet re=ps.executeQuery();
  
        
		if(re.next())
		{
		    value= true;
		}
		else
		{
			value= false;
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return value;
  }
}
