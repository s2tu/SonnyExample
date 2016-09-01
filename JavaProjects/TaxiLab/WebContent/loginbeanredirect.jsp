<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Redirect Login/Register</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
		
		<jsp:useBean id="taxiuser" class="domains.TaxiUser" scope="session" />
		<jsp:setProperty name="taxiuser" property="*" />
		<jsp:forward page="LoginServlet"></jsp:forward>

</body>
</html>