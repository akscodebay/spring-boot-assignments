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
	<th>Branch Address</th>
	<th>Phone Number</th>
</tr>
<c:forEach var="branches" items="${branches}">
<tr>
    <td><c:out value="<%=++i %>" /></td>
    <td><c:out value="${branches.address}" /></td>
    <td><c:out value="${branches.phoneNum}" /></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>