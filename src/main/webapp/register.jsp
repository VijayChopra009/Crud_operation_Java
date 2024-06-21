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
       <form action="registerbean.jsp" method="post">
   <label>User-Id</label>
   <input type="text" name="id"/><br>
   <label>Username</label>
   <input type="text" name="username"/><br>
   <label>Password</label>
   <input type="password" name="password"/><br>
   <label>Name</label>
   <input type="text" name="name"/><br>
   <label>Email</label>
   <input type="email" name="email"/><br>
   <label>address</label>
   <input type="text" name="address"/><br>
   <label>Designation</label>
   <input type="text" name="designation"/><br>
   <label>D-O-J</label>
   <input type="text" name="doj"/><br>
   <label>mobno</label>
   <input type="text" name="mobno"/><br>
   <label>Salary</label>
   <input type="text" name="salary"/><br>
   <label>Male</label>
   <input type="radio" name="gender"  value="male" checked="checked"/>
   <label>Female</label>
    <input type="radio" name="gender" value="female"/>
     <br>  <input type="submit" value="Register"/><br>
   </form>
</body>
</html>