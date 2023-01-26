<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="true"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<jsp:include page="_menu.jsp" />

	<h2>Admin Page</h2>


	<h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>

	<b>This is protected page!</b>
</body>
</html>