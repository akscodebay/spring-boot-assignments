<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<% int i = 0; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>People Bank</title>
</head>
<body>
<h1 style="text-align:center">People Bank</h1>
<div align="center">
<table border="1">
<tr>
	<th>S.No.</th>
	<th>Service Name</th>
	<th>Description</th>
</tr>
<c:forEach var="services" items="${services}">
<tr>
    <td><c:out value="<%=++i %>" /></td>
    <td><c:out value="${services.serviceName}" /></td>
    <td><c:out value="${services.desc}" /></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>