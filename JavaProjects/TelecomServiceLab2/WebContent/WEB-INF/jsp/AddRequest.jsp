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

	<h1 style="color:green">${statusMsg}</h1>
	<form:form action="serviceRequest/addRequest" method="POST">
		<label>Request ID:</label>
		<br>
		<form:input  path="requestID"/>
		<br>
		<label>Description:</label>
		<br>
		<form:input path="description"/>
		<br>
		<label>Request Type:</label>
		<br>
		<form:select  path="requestType">
			<option value="techinical">Technical</option>
			<option value="payment_related">Payment Related</option>
			<option value="special_offers">Special Offers</option>
			
		</form:select>
		<br>
		<label>Customer ID:</label>
		<br>
		<form:input  path="customerID"/>
		<br>
		<button>Add Request</button>
	</form:form>
	
	<a href="/TelecomServiceLab2">Home</a>
</body>
</html>