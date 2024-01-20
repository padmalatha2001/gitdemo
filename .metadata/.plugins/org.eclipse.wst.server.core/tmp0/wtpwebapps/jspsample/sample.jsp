<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:aqua">
    <center>
        <h1 style="color:lawngreen">This is first jsp program</h1>
        <%!
          public String getMessage()
          {
        	return "Welcome to JSP Classes";
          }
        %>
        <%
          String msg=getMessage();
        %>
        
           <h2 style="background:blue; color:white;"><%=msg%></h2>
        
    
    </center>
      
</body>
</html>