<%@page import="java.util.*" %>
<%@page import="com.Controller.*" %>

<html>
<head>

<title>Edit Page</title>
</head>
<body>
<form action="up">
<center>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach items="${edata}" var="stu">  
<input type="hidden" name="id" value="${stu.id}">
<table>
  <tr>
    <td>Name:</td>
    <td><input type="text" name="nm" value="${stu.name}"></td>
  </tr>
  <tr>
    <td>Address:</td>
    <td><input type="text" name="ad" value="${stu.address}"></td>
  </tr>
   <tr>
    <td>Username:</td>
    <td><input type="text" name="un" value="${stu.username}"></td>
  </tr>
   <tr>
    <td>Password:</td>
    <td><input type="text" name="pw" value="${stu.password}"></td>
  </tr>
  
  <tr>
    <td><input type="submit" value="Update"></td>
  </tr>
</table>
</c:forEach>
</form>
</body>
</html>