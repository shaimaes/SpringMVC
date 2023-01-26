<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello ${form.firstName}</h1>

	<table>
		<tr>
			<td>First Name</td>
			<td>${form.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${lastName}</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>${form.id}</td>
		</tr>
	</table>
</body>
</html>