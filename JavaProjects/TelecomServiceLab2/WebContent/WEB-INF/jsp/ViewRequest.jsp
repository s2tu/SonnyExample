<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<form action="serviceRequest/viewRequest" method="GET">
	<table>
		<tr>
			<td><Label>Request ID:</Label></td>
			<td><input type="number" name="key"></td>
		</tr>
		<tr><td><input name="key" type="submit" value="View Request"></td>
			<td>	<input  type="submit" value="View All Request" formaction="serviceRequest/viewAllRequest" formmethod="GET">	</td>
		</tr>
	</table>
	</form>
	<a href="/TelecomServiceLab2">Home</a>
</body>
</html>