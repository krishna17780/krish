<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="StudentEx">
first name: <form:input path="firstName" />
		<br>
		<br>
last name;<form:input path="lastName" />
		<br>
		<br>
	
Country:
<form:select path="Counttry">
			<form:options items="${StudentEx.countryOptions}" />
		</form:select>
		<br>
		<br>
Favourite language:

java<form:radiobutton path="favourtelang" value="java"/>
C#<form:radiobutton path="favourtelang" value="C#"/>
PHP<form:radiobutton path="favourtelang" value="PHP"/>
<br><br>
Favourite os:
linux: <form:checkbox path="operatingsystems" value="Linux"/>
unix: <form:checkbox path="operatingsystems" value="unix"/>
mac: <form:checkbox path="operatingsystems" value="mac"/>

		<input type="submit" value="submit">
	</form:form>
</body>
</html>