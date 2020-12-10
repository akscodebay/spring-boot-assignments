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
<table border="1">
	<tr>
		<th>
			ID
		</th>
		<th>
			Name
		</th>
		<th>
			Email
		</th>
		<th>
			Location
		</th>
	</tr>
	<c:forEach var="employee" items="${employee}">
		<tr>
			<td>
				<c:out value="${employee.id}"/>
			</td>
			<td>
				<c:out value="${employee.name}"/>
			</td>
			<td>
				<c:out value="${employee.email}"/>
			</td>
			<td>
				<c:out value="${employee.location}"/>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>