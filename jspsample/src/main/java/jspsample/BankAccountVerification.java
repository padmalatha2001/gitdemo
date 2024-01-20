package jspsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BankAccountVerification {
      private Connection con;
      private PreparedStatement ps;
      private ResultSet rs;
      public ResultSet verifyAccount(int accountNumber)
      {
         try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","padma");
			ps=con.prepareStatement("select * from bank where accountno=?");
			ps.setInt(1, accountNumber);
			rs=ps.executeQuery();
			if(rs.next())
			{
				rs.beforeFirst();
				return rs;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         return rs;
      }
}
