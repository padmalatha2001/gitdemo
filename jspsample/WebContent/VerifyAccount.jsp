<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jspsample.BankAccountVerification" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <input type="text" placeholder="Enter AccountNo" name="acno">
    <br><br>
    <input type="submit" value="verify">
    <%! private ResultSet rs; %>
    <%
        String tempac=request.getParameter("acno");
       if(tempac!=null)
       { 
    	 int acno=Integer.parseInt(tempac);
         BankAccountVerification b=new BankAccountVerification();
         rs=b.verifyAccount(acno);
        if(rs!=null)
        {
           rs.next();
        	
    %>
       <table style="color:aqua border:1px solid black ">
       <tr>
         <th>BANKNAME</th>
         <th>IFSC</th>
         <th>ACCOUNTNO</th>
         <th>USERNAME</th>
         <th>MOBILENO</th>
         <th>BALANCE</th>
       </tr>
          <tr>
          <td><%=rs.getString(1) %></td>
          <td><%=rs.getString(2) %></td>
          <td><%=rs.getInt(3) %></td>
          <td><%=rs.getString(4) %></td>
          <td><%=rs.getString(5) %></td>
          <td><%=rs.getInt(6) %></td>
          </tr>
       </table>
             
    <%
         }
       
        else
        {
    %>
      <h2 style="color:red">Record Not Found</h2>
   <%
        }
      }
   %>
</body>
</html>