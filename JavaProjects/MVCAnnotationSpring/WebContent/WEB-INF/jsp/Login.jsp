<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
	<c:out value="Language"/>
	<a href="?lang=en">English</a>
	<a href="?lang=fr">French</a>
	<a href="?lang=gr">German</a>
		${pageContext.response.locale}
	<label><spring:message code="lbl.button.submit" var="btnText"></spring:message></label>
	<form:form action="" method="post">
		<label><spring:message code="lbl.username"></spring:message></label>
		<form:input path="username"/>
		<label><spring:message code="lbl.password"></spring:message></label>
		<form:input path="password"/>
		<label><spring:message code="lbl.phoneNumber"></spring:message></label>
		<form:input path="phonenumber"/>
		<input type="submit" value="${btnText}">						
	</form:form>
</body>
</html>