<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processform" modelAttribute="student">
	FirstName: <form:input path="firstName"/><br><br>
	LastName: <form:input path="lastName"/><br><br>
	Country:		
		<form:select path="country">	
			<form:options items="${student.countryOptions}" />			
		</form:select><br><br>
	Favorite Language:		
		Java <form:radiobutton path="lang" value="Java" />
		C# <form:radiobutton path="lang" value="C#" />
		PHP <form:radiobutton path="lang" value="PHP" />
		Ruby <form:radiobutton path="lang" value="Ruby" /><br><br>
	Operating System:
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		Windows<form:checkbox path="operatingSystem" value="Windows"/>
		MAC OS<form:checkbox path="operatingSystem" value="MAC OS"/><br><br>
	<input type="submit">
</form:form>
</body>
</html>