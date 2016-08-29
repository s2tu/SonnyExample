<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Top Student</title>

</head>
<body>




	<h1>Top Students</h1>
	<c:forEach items="${topStudents}" var="student">
		<c:out value="${student.name}"></c:out>
		<c:out value="${student.mark}"></c:out>
		<c:out value="${student.department}"></c:out>
		<c:if test="${student.mark >= 90}">*****</c:if>
		<c:if test="${student.mark >= 65 && student.mark < 90}">****</c:if>
		<c:if test="${student.mark >= 55 && student.mark < 65 }">***</c:if>
		<c:if test="${student.mark >= 40 && student.mark < 55}">**</c:if>
		<c:if test="${student.mark < 40}">*</c:if>
	
	
	
		<br>
	</c:forEach>
</body>
</html>