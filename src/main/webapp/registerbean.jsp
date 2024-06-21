<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <jsp:useBean id="rb" class="beans.RegisterBean" scope="session"/>
    <jsp:setProperty  name="rb" property="*"/>
   <h1>
    <%
        if(rb.register()){
        	out.print("Register Successfully  try  to Login!");
         
    %>
    </h1>
     <jsp:forward page="login.jsp"/>
     <h1>
    <% 
        }
     else{
    	 out.print(" Input Data Error  !");
     %>
     </h1>
     <%@include file="register.jsp" %>
    <%	 
     }
    %>
</body>
</html>