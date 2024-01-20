<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jspsample.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:aqua">
   <center>
       <form action="">
       <input type="email" placeholder="Enter Email" name="email">
       <br><br>
       <input type="password" placeholder="Enter Password" name="password">
       <br><br>
       <input type="submit" value="verify">
       </form>
       
       <%
           String email=request.getParameter("email");
          if(email!=null)
           {
        	  String password=request.getParameter("password");
              UserDao ud=new UserDao();
           if(ud.verifyuser(email,password))
           {
        %>
        
           <h1 style="color:green">Login Successful</h1>
           
        <% 
           }
            else
            {
         %>
         
            <h1 style="color:red">Invalid Credentials</h1>
            
        <%
            } 
           }
        %>
   </center>
</body>
</html>