
<%@page import="com.fasterxml.jackson.annotation.JsonFormat.Value"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student conformation</title>
</head>
<body>
	first name:${StudentEx.firstName } last name:${StudentEx.lastName }
	country:${StudentEx.counttry } country:${StudentEx.favourtelang }
	<ul>
		<c:forEach var="temp" items="${StudentEx.operatingsystems}">
			<li>${temp}</li>
		</c:forEach>

	</ul>
</body>
</html>