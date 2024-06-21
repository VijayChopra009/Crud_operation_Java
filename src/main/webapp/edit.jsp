<%@page import="beans.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
        RegisterBean   rbean = (RegisterBean) session.getAttribute("registerbean");
  %>
   
   
   
   
  <form action="editbean.jsp" method="post">
   <label>User-Id</label>
   <input type="text" name="id" readonly="readonly"  value="<%=rbean.getId() %>"/><br>
   <label>Name</label>
   <input type="text" name="name" value="<%=rbean.getName() %>"/><br>
   <label>Email</label>
   <input type="email" name="email" readonly="readonly" value="<%=rbean.getEmail() %>"/><br>
   <label>address</label>
   <input type="text" name="address"  value="<%=rbean.getAddress() %>"/><br>
   <label>Designation</label>
   <input type="text" name="designation" value="<%=rbean.getDesignation() %>"/><br>
   <label>D-O-J</label>
   <input type="text" name="doj" value="<%=rbean.getDoj()%>"/><br>
   <label>mobno</label>
   <input type="text" name="mobno"  value="<%=rbean.getMobno() %>"/><br>
   <label>Salary</label>
   <input type="text" name="salary" value="<%=rbean.getSalary() %>"/><br>
   <label>Male</label>
   <input type="radio" name="gender"  value="male" checked="checked"/>
   <label>Female</label>
    <input type="radio" name="gender" value="female"/>
     <br>  <input type="submit" value="Edit"/><br>
   </form>

     
 
     
</body>
</html>