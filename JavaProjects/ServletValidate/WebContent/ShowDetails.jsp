<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>

	<% if (!session.isNew() && session.getAttribute("currUser") != null){ %>
	<p>Is New Session</p><%= session.isNew() %>
	<p>Session ID</p><%=session.getId() %>
	
	<div style="float:right">
	<p>Currently logged in as : </p> ${currUser}
	</div>
	<h1>Details are displayed here.</h1>
	
	<form action="SessionManager">
		<input type="submit" value="Logout">
	</form>
	
	<% }else{ %>	
		<p>You are not logged in please try again. <a href="index.jsp">Go Back.</a></p>
		
	<%  } %>
</body>
</html>