<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="header.html" %>
<body>
	<form action="GoogleSearch">
		<label for="googlesearch">Google Search: </label>
		<input type="text" name="googlesearch" id="googlesearch">
		<button>Search</button>
	</form>
	<br>	
	
	<datalist id="numbers">
		<option>12345678</option>
	</datalist>
	<form action="JSPServlet">
		<input id="phonenumber" name="phonenumber" type="text" list="numbers">
		<button>Submit</button>
	</form>

	

</body>
<jsp:include page="Footer.jsp"></jsp:include>
</html>