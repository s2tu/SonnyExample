<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
	<form:form action="#" method="post">
		<label>Customer Number</label>
		<br>
		<form:input  path="customerNumber"/>
		<br>
		<label>Customer Name</label>
		<br>
		<form:input path="customerName"/>
		<br>
		<label>Email ID</label>
		<br>
		<form:input  path="email_id"/>
		<br>
		<label>Phone Number</label>
		<form:input  path="phonenumber"/>
		
		<button>Add</button>
	</form:form>
</body>
</html>