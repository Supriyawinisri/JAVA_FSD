<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form id="form-1" action="add_league.do" method="post">
	<label for="input-1">League title:</label>
	<input id="input-1" name="title" required="true" type="text"/><br/>
	<label for="input-2">Year</label>
	<input id="input-2" name="year" required="true" type="text"/><br/>
	<label for="input-3">Season</label>
	<select name="season">
	<option value="unknown">Select...</option>
	<option value="Summer">Summer</option>
	<option value="Winter">Winter</option>
	<option value="Autumn">Autumn</option>
	<option value="Spring">Spring</option>
	</select><br/>
	<input type="submit" value="Add League" id="button-1"/><br/>
</form>
<%int flag=0; %>
<c:if test="${ERROR != null}">
	<jsp:include page="error.jsp"/>
	<% flag=1;%>
</c:if>
<c:if test="${ERROR == null}">
<c:if test="${flag == 0}">
<jsp:include page="success.jsp"/>
</c:if>
</c:if>
</body>
</html>