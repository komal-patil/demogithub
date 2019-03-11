<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<center>
<form action="reg">
<table>
  <tr>
    <td>Name:</td>
    <td><input type="text" name="nm"></td>
  </tr>
  <tr>
    <td>Email:</td>
    <td><input type="text" name="em"></td>
  </tr>
  <tr>
    <td>Username:</td>
    <td><input type="text" name="un"></td>
  </tr>
  <tr>
    <td>Password:</td>
    <td><input type="password" name="pw"></td>
  </tr>
  <tr>
    <td>Role ID:</td>
    <td><input type="number" name="rl"></td>
  </tr>
   <tr>
    <td colspan="2" align="center"><input type="submit" value="Register"></td>
  </tr>
</table>
</form>
</body>
</html>