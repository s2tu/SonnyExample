<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

</head>
<body>


	<h1>Donors should be shown here</h1>
	
	<br>
	<script type="text/javascript">
	$(function(){
			$.ajax({
				type:"GET",
				dataType:"json",
				//url:"http://jsonplaceholder.typicode.com/users/" + escape(userCode),
				url:"/Philantrophy_VER3_MAVEN/ViewDonor/${projectID}" ,
				error:function(xhr, textStatus, errorThrown){
					console.log(errorThrown);
					alert("Error");
				},
				success:function(data, textStatus){
					console.log(data);
					output = "";
					for(donor in data["ListofDonors"]){

						//private long handPhone;
						//private String donorName;
						//private String email;
						//private Address address;
						
						output = output +  ( parseInt(donor)+1) + ": " +" Name=" + data["ListofDonors"][donor]["donorName"]   + "<br>"
														  +" Email=" + data["ListofDonors"][donor]["email"]   + "<br>"
														  +" Address=" + data["ListofDonors"][donor]["address"]   + "<br>"
														  +" HandPhone=" + data["ListofDonors"][donor]["handPhone"]   + "<br><hr/>";
					}
					$("#output").html(output);
				}				
				});
	});
	</script>
	
	
	<div id="output"></div>
</body>
</html>