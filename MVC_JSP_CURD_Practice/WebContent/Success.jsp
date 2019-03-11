<%@page import="java.util.*" %>
<%@page import="com.Controller.*" %>

<html>
<head>
<script>
function edit()
{
	alert("Edit");
	document.fn.action="edt";
	document.fn.submit();
}

/* function add()
{
	alert("Add");
	document.fn.action="ad";
	document.fn.submit();
}
 */
function del()
{
	alert("Delete");
	document.fn.action="dl";
	document.fn.submit();
}

function updat()
{
	alert("Update");
	document.fn.action="up";
	document.fn.submit();
}


</script>
<title>Success Page</title>
</head>
<body>
<form name="fn">
<center>
<h2 style="color: blue">All Students Data</h2>
<table border="2">
<tr>
<th>Choice</th>
<th>ID</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>
</tr>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach items="${ldata}" var="stu">  
<tr>
<td><input type="radio" name="select" value="${stu.id}"></td>
<td><c:out value="${stu.id}"></c:out></td>
<td><c:out value="${stu.name}"/></td>
<td><c:out value="${stu.address}"/></td>
<td><c:out value="${stu.username}"/></td>
<td><c:out value="${stu.password}"/></td>
</tr>
</c:forEach>
</table>
<br>
<input type="button" value="Edit" onclick="edit()">
<!-- <input type="button" value="Add" onclick="add()"> -->
<input type="button" value="Delete" onclick="del()">

<a href="LoginForm.jsp" style="color: red">Go to Login</a>
</form>
</body>
</html>