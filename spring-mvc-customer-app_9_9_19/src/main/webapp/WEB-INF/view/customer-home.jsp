<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRM</title>
</head>
<body>
<h2>CRM-Customer Relationship Management</h2><br/>
<form:form action="create" modelAttribute="customer">
first name<form:input path="fname"/><br/>
last name<form:input path="lname" /><br/>
email<form:input path="email"/><br/>
<input type="submit">
</form:form>
</body>
</html>