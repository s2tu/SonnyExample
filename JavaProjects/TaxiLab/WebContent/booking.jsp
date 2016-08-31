<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Booking</title>
		<jsp:include page="includes.jsp"></jsp:include>
		<script type="text/javascript" src="js/booking.js"></script>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	</head>
	<body>
		<div class="titleDiv"></div>
		
		<div style="color:green">
			<h1><c:out value="${Status}"></c:out></h1>
		</div>			
		
		<jsp:include page="navigationBooking.jsp"></jsp:include>
	
		<div id="bookingContent">
			<h1>Book Cab</h1>
			
			<form action="BookingServlet" method="POST">
				<table border=1>
					<tr><td><label>Name</label></td><td><input type="text" name="name" id="name" value="${userData.name}" required></td></tr>
					<tr><td><label>Telephone</label></td><td><input type="number" name="phonenumber" id="phonenumber" value="${userData.phonenumber}" required></td></tr>
					<tr><td><label>Booking Type</label></td><td><select id="bookingtype" name="bookingtype"><option>Meter</option></select></td></tr>
					<tr><td><label>Pickup Place</label></td><td><input type="text" name="pickup" id="pickup" required></td></tr>
					<tr><td><label>Drop Place</label></td><td><input type="text" name="dropplace" id="dropplace" required></td></tr>
					<tr><td><label>Book Date</label></td><td><input type="date" name="bookdate" id="bookdate" value="" required></td></tr>	
					<tr><td><label>Book Later</label><input type="radio"  name="booking" id="booklater" value="booklater"></td><td><label>Book Now</label><input type="radio" name="booking" id="booknow" value="booknow" checked></td></tr>
					<tr><td></td><td><input type="submit"  name="submit" id="submit" value="Submit"></td></tr>
				</table>
			</form>
		</div>
	</body>
</html>