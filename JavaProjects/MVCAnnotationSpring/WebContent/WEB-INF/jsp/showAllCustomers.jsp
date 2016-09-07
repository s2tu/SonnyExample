<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  localhost:4040/mcwithannotationspring/styles/styles.css which does not have a mapping in controller -->
<link href="../resources/css/Style.css" type="text/css" rel="stylesheet">
<script src="../resources/js/simple.js"	></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	<table>
	<c:forEach items="${CustomerList}" var="customer">
		<tr><td>
		<spring:url value="findCustomer?key=${ customer.customerNumber}" var="url"/>
		<a href="${url}">${customer}</a>		
		<td>
		</tr>
		
	</c:forEach>
	</table>
</body>
</html>