<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Save Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>

<%-- <link href="<c:url value="/style/avancee.css" />" rel="stylesheet"> --%>

	<%-- <form:form method="POST" modelAttribute="employee"
		action="save.do"> --%>
		
		<form:form action="save.do"
		method="post" modelAttribute="employee">
		<a href="${pageContext.request.contextPath }/emp/save?mylocale=en">English</a>
		
		<a href="${pageContext.request.contextPath }/emp/save?mylocale=fr">Francais</a>
		
		<table>
			<tr>
				<td><spring:message code="id.label"/></td>
				<td><form:input path="id" /></td>
				 <td><form:errors path="id" cssClass="error" /></td> 
			</tr>
			

			
			<tr>
				<td><spring:message code="name.label"/></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td> 
			</tr>
			
						
			<tr>
				<td><spring:message code="role.label"/></td>
				<td><form:select path="role">
						<form:option value="" label="Select Role" />
						<form:option value="ceo" label="CEO" />
						<form:option value="developer" label="Developer" />
						<form:option value="manager" label="Manager" />
					</form:select></td>
				<td><form:errors path="role" cssClass="error" /></td> 
			</tr>
			

			
			<tr>
			<td><spring:message code="gender.label"/></td>
			<td>
			<form:radiobutton path="Gender" value="Male" label="Male" /> 
			<form:radiobutton path="Gender" value="Female" label="Female"/>
			 </td>
			 <td><form:errors path="gender" cssClass="error" /></td> 
			</tr>
			
			
			<tr>
			<td> <spring:message code="food.label"/> </td>
			<td>
			<form:checkbox path="Food" value="Breakfast" label="Breakfast"/>
			<form:checkbox path="Food" value="Lunch" label="Lunch"/>  
			<form:checkbox path="Food" value="Dinner" label="Dinner"/>  
			</td>
			<td><form:errors path="food" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Save"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>