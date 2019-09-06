<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
FirstName: ${temp.firstName}<br><br>
LastName: ${temp.lastName}<br><br>
Country: ${temp.country}<br><br>
Languages: ${temp.lang}<br><br>
<c:forEach items="${student.operatingSystem}" var="current">
	[<c:out value="${current}" />]
</c:forEach>
</body>
</html>