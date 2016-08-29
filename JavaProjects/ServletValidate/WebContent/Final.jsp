<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Is New Session</p><%= session.isNew() %>
	<p>Session ID</p><%=session.getId() %>
	<div style="float:right">
	<p>Currently logged in as : </p> ${currUser}
	</div>
	<h1>Final display are displayed here.</h1>
	
</body>
</html>