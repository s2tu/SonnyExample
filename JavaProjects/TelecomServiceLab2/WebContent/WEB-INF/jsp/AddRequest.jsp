<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<body>
	<form:form action="#" method="post">
		<label>Request ID</label>
		<br>
		<form:input  path="requestID"/>
		<br>
		<label>Description</label>
		<br>
		<form:input path="description"/>
		<br>
		<label>customer ID</label>
		<br>
		<form:input  path="customerID"/>
		<br>
		<button>Add Request</button>
	</form:form>
</body>
</html>