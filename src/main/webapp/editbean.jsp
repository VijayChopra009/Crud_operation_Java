<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:useBean id="ebean" class="beans.EditBean" scope="session"/>
    <jsp:setProperty name="ebean" property="*" />
    <h1>
    <%
      if(ebean.update()){
    	  out.print("Profile Updated Successfully  ");
    %>
    </h1>
    <jsp:forward page="index.jsp"/>
    <h1>
    <%     	 
      }
      else{
    	  out.print("Entered  valid Data  !");
    %>
    </h1>
    <jsp:include page="update.jsp"/>
    <%
      }
    %>
    

</body>
</html>