<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
		<jsp:include page="includes.jsp"></jsp:include>
	</head>
	<body>
		<div class="titleDiv"> Sonny's Taxi Company</div>
		<%if(request.getAttribute("Error")!=null){%>
			<h1 style="color:red">Login Failed.  Check Values and Try Again.</h1>
		<%}%>
		<%if(request.getAttribute("Registered")!=null){%>
			<h1 style="color:green"><%= request.getAttribute("Registered") %></h1>
		<%}%>
		<%if(request.getAttribute("RegisterError")!=null){%>
			<h1 style="color:red"><%= request.getAttribute("RegisterError") %></h1>
		<%}%>				
		<jsp:include page="navigation.jsp"></jsp:include>
		<aside id="sideBar" class="content">
			<form id="loginForm" method="post" action="LoginServlet">
				<h1>User Login</h1>
				<table class="loginTable" border=1>
					<tr><td><label for="email">Email:</label></td><td><input type="text" name="email" id="email" required></td></tr>
					<tr><td><label for="password">Password:</label></td><td><input type="password" name="password" id="password" required></td></tr>
								<tr><td><label for="city">City:</label></td><td><select id="city" name="city"><option value="toronto" required>Toronto</option></select></td></tr>
					<tr><td><input type="reset" value="Reset"></td><td><input type="submit" value="Login" required></td></tr>
				</table>	
			</form>
			
			<jsp:include page="register.jsp"></jsp:include>
			<a href="#" id="formswitch">Register Now!</a>
		</aside>
		<div id="main" class="content">
			<div style="padding-left:10px;">
				<h1>Welcome To Sonny's Taxi Company</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In venenatis, turpis nec malesuada tempus, magna ipsum auctor felis, semper laoreet enim quam eu augue. Sed pharetra, risus a bibendum interdum, lorem est tincidunt elit, ac luctus ante massa sed eros. Nullam eu leo blandit, auctor quam et, iaculis leo. Quisque et nisi tortor. Integer et arcu leo. Praesent eget felis ut turpis dapibus varius. Aliquam imperdiet ornare felis, sit amet blandit ante gravida in. Nulla id nisl vehicula, vestibulum dolor eget, imperdiet nunc. Aenean ultrices molestie mauris. Curabitur congue sem eget eros laoreet lobortis. Donec mattis sed ante sit amet varius. Aliquam nec ipsum massa. Ut sit amet velit magna.
				<br>
				<p>
	Curabitur vulputate eleifend lacus, vel ultrices erat laoreet et. Integer nec blandit risus, in tempor mi. Fusce suscipit erat lectus, ut tincidunt sapien congue eget. Curabitur mi risus, accumsan in tristique sit amet, rhoncus id odio. Donec tincidunt nunc leo. Sed tincidunt sed ex scelerisque posuere. Sed venenatis nisl ut sapien accumsan pretium. Nulla facilisi. Praesent interdum mollis erat a porta. Aliquam sodales egestas sem, et tempor justo maximus quis. Aliquam tempus gravida nibh. Nunc magna erat, pulvinar quis tincidunt ut, sodales ac odio. Curabitur feugiat mi mauris, et aliquet ex scelerisque et.</p>
				</p>
			</div>
		</div>
	</body>
</html>