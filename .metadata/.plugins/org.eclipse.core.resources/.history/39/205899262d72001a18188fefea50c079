<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer validations</title>
<style type="text/css">
.error{color: red}
</style>
</head>
<body>
<form:form action="customerProcess" modelAttribute="Customer">

first name: <form:input path="firstName"/>
<br>
last name: <form:input path="lastName" />

<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>

free passes: <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"></form:errors>
<br><br>
postal code: <form:input path="zipCode"/>
<form:errors path="zipCode" cssClass="error"></form:errors>

<br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>