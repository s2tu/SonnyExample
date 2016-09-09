<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

		<script type="text/javascript">

			var userCode;
			var targetElement;
			 
			function getData(){
				userCode = $("#code").val();	
				$.ajax({
					type:"GET",
					dataType:"json",
					//url:"http://jsonplaceholder.typicode.com/users/" + escape(userCode),
					url:"http://localhost:7070/getReports",
					error:function(xhr, textStatus, errorThrown){
						console.log(errorThrown);
						alert("Error");
					},
					success:function(data, textStatus){
						console.log(data);
						$("#name").text(data);
					}				
					});
			}
		
		
			
		</script>
		
<body>
	<h1>Welcome to this page</h1>
	<a href="/getReports">Get Report</a>
	<button onClick="getData()">Load Reports Below</button>
	<div id="name"></div>
</body>
</html>