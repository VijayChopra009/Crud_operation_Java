<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:useBean id="lb" class="beans.LoginBean" scope="session"/>
    <jsp:setProperty  name="lb" property="*"/>
    <%
       if(lb.login()){
    	   session.setAttribute("username", lb.getUsername());
    %>
    <jsp:forward page="welcome.jsp"/>
  
    <%
      }
       else
       {
    	   out.print("Invalid User and Password! ");
       %>
       <br> 
       <%@ include file="login.jsp" %>
       <%   	   
       }
    
    %>
</body>
</html>