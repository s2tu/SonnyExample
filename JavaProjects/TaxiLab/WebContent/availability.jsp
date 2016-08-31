<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="includes.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<div class="titleDiv"></div>
	<jsp:include page="navigationBooking.jsp"></jsp:include>
	<table style="margin-top:5em;" border=1>
	<!-- 
	private String cabNum;
	private String cabType;
	private String driverName;
	private String curLocation;
	private String availability; -->
		<tr><th><label>Cab Number</label></th><th><label>Cab Type</label></th><th><label>Driver Name</label></th><th><label>Location</label></th><th><label>Book</label></th></tr>
		<c:forEach items="${cabData}" var="cabData" >                                                                                                  
			<tr>
				<td><label>${cabData.cabNum}</label></td>
				<td><label>${cabData.cabType}</label></td>
				<td><label>${cabData.driverName}</label></td>
				<td><label>${cabData.curLocation}</label></td>	
				<td><a href="OccupyTaxiServlet?cabID=${cabData.cabNum}">Book</a></td>
			</tr>	
		</c:forEach>
	
	</table>
</body>
</html>