<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	

<html>
<head>
	<title>Employee Saved Successfully</title>
</head>
<body>
<h3>
	Employee Saved Successfully.
<%-- 	<spring:message code="success.emp"/> --%>
</h3>


<%-- <strong>Employee ID:${emp.id}</strong><br> --%>
<spring:message code="emp.id"/> : ${emp.id}<br> 
<spring:message code="emp.name"/> : ${emp.name}<br> 
<spring:message code="emp.role"/> : ${emp.role}<br> 
<%-- <strong>Employee Name:${emp.name}</strong><br>
<strong>Employee Role:${emp.role}</strong><br>
<strong>Employee Gender:${emp.gender}</strong><br> --%> 


Meals:   
<ul>  
<c:forEach var="meal" items="${emp.food}">  
<li>${meal}</li>  
</c:forEach>  
</ul>  

</body>
</html>
