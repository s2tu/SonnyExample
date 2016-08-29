<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using Java Bean</title>
</head>
<body>
	<jsp:useBean id="donor" class="com.domains.Donor" scope="session" />
	<jsp:setProperty property="*" name="donor"/>
	<h2>Thanks you have entered the following Details</h2>
	

	<jsp:getProperty property="donorName" name="donor"/>
	<jsp:getProperty property="email" name="donor"/>
	<jsp:getProperty property="handPhone" name="donor"/>
	
	
	<jsp:forward page="AddDonorToDB"/>

				
	
</body>
</html>