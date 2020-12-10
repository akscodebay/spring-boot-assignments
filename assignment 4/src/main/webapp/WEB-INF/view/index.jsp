<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form:form action="/" method="post" modelAttribute="employee">
<table>
	<tr>
		<td>ID</td>
		<td><form:input path="id"/></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><form:input path="name"/></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><form:input path="email"/></td>
	</tr>
	<tr>
		<td>Location</td>
		<td><form:input path="location"/></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit"/></td>
	</tr>
</table>
</form:form>
<font color="green" size="10"><c:out value="${message}"/></font>
</body>
</html>