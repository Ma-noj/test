<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form:form action="saveUser" modelAttribute="user">
		<label>User Name</label>
		<form:input path="userName" />
		<br>
		<br>
		<label>User Email</label>
		<form:input path="userEmail" />
		<br>
		<br>
		<label>User Password</label>
		<form:input path="userPassword" />
		<br>
		<br>
		<label>User Age</label>
		<form:input path="userAge" />
		<br>
		<br>
		<form:button>Register</form:button>

	</form:form>
</body>
</html>