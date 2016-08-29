<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="color:red">
		<% if(request.getAttribute("message")!=null){
		%>
			<%= request.getAttribute("message") %>
		<% } %>	
		
	</div>
	<form  action="ReadValues.jsp" method="post">
		<label for="username">Username:</label>
		<input type="text" name="username" id="username">
		<br>
		<label for="password">Password:</label>
		<input type="password" name="password" id="password">
		<button>Login</button>
	</form>
	<form action="LoadingNames">
			<button>Load Names</button>
	</form>
</body>
</html>