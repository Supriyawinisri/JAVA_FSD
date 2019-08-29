<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="response.jsp" method="post">
		<label for="input-1">Name:</label>
		<input id="input-1" name="user" placeholder="username" type="text"/>
		<label for="input-2">Password:</label>
		<input id="input-2" name="pass" placeholder="password" type="password"/>
		<input type="submit" value="Login"/>
	</form>
	<c:if test="${ERROR != NULL }">
		<jsp:include page="login_error.jsp"></jsp:include>
	</c:if>
</body>
</html>