<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserInfo</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>UserID</th>
			<th>UserName</th>
			<th>UserEmail</th>
			<th>UserAge</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="user" items="${ listUser}">
			<tr>
				<td>${user.getUserId()}</td>
				<td>${user.getUserName() }</td>
				<td>${user.getUserEmail() }</td>
				<td>${user.getUserAge() }</td>
				<td><a href="edit?id=${user.getUserId()}">Edit</a></td>
				<td><a href="delete?id=${user.getUserId()}">Delete</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>