<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- default namespace does not work -->
<%@ taglib uri="http://sapient.com/training/example" prefix="mt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<mt:greet message="Hello World!"></mt:greet>
	<c:set value="Happy" var="message" scope="page"></c:set>
	<mt:greet message="${message}"></mt:greet>
	
</body>
</html>