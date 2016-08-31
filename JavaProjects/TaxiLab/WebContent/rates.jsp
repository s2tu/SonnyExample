<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<jsp:include page="includes.jsp"></jsp:include>
</head>
<body>
	<div class="titleDiv"></div>
	<jsp:include page="navigationBooking.jsp"></jsp:include>
	<h1>Rates</h1>
	<table border=1>
		<tr>
				<th id="col1">Vehicle Type</th>
				<th id="col2">Minimum km</th>
				<th id="col3">Addl Charges/km</th>
				<th id="col4">WTG Charges<br>for 1 min</th>
			</tr>	
	<tr>
					
	<td>INDICA A/C (4+1)</td>
				<td>Rs. 100 /- <br>(4KMS)</td>
				<td>Rs. 16 /-</td>
				<td>Rs. 2/-</td>
			</tr>
			<tr>
				<td>SWIFT DZIRE - A/C (4+1)</td>
				<td>Rs. 100 /- <br>(4KMS)</td>
				<td>Rs. 18 /-</td>
				<td>Rs. 2/-</td>
			</tr>
			<tr>
				<td>INDIGO - LOGAN - FORD FIESTA A/C (4+1)</td>
				<td>Rs. 100 /- <br>(4KMS)</td>
				<td>Rs. 18 /-</td>
				<td>Rs. 2/-</td>
			</tr>
			<tr>
				<td>TAVERA A/C (9+1)</td>
				<td>Rs. 150 /- <br>(4KMS)</td>
				<td>Rs. 21 /-</td>
				<td>Rs. 2/-</td>
			</tr>
			<tr>
				<td>INNOVA - XYLO A/C (6+1)(7+1)</td>
				<td>Rs. 150 /- <br>(4KMS)</td>
				<td>Rs. 21 /-</td>
				<td>Rs. 2/-</td>
			</tr>
	</table>
</body>
</html>