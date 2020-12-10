<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<table>
	<tr>
		<td>ID:</td>
		<td><c:out value="${employee.id}"/></td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><c:out value ="${employee.name}"/></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><c:out value ="${employee.email}"/></td>
	</tr>
	<tr>
		<td>Location:</td>
		<td><c:out value ="${employee.location}"/></td>
	</tr>	
</table>
<font color="red" size="10"><c:out value="${message}"/></font>
</body>
</html>