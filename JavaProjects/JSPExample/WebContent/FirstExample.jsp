<%@ page import="java.util.*, com.training.domains.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP</title>

</head>
<%@ include file="header.html" %>
<body>
	<% out.println("Welcome to JSP Programming "); %>
	<br>
	<%! String instanceName = "Ramesh"; %> <%-- Declaration Global -At the Class Level --%>

	<% String localName2="Ganes4h"; %> <%-- Declaration Local to Service Method ONLY--%>

	<%= instanceName  %>
	<br>
	<%= localName2 %>


	<br>
	<h4>--------------------------</h4>
	
	<h3>Output:</h3>
	
	<% List<PaymentStatus> history =(List<PaymentStatus>)request.getAttribute("payHistory"); %>
	<table border=1>
		<tr>
			<td>TransActionID</td>
			<td>TransActionDate </td>
			<td>Description</td>
			<td>Amount</td>	
		</tr>
		<% for(PaymentStatus pmt:history){ %>
		<tr>
			<td><%=pmt.getTransactionID() %></td>
			<td><%=pmt.getTransactionDate() %></td>
			<td><%=pmt.getDescription() %></td>
			<td><%=pmt.getAmount() %></td>
		</tr>
		<%  } %>
		
	</table>
	<br>
	<h4>--------------------------</h4>	

	
</body>
<jsp:include page="Footer.jsp"></jsp:include>
</html>