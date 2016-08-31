
<form id="registerForm" action="RegisterServlet" method="POST">
	<h1>New User Registeration</h1>
	<table class="loginTable" border=1>
		<tr><td><label for="name">Name:</label></td><td><input type="text" name="name" id="name" required></td></tr>	
		<tr><td><label for="email">Email:</label></td><td><input type="text" name="email" id="email" required></td></tr>
		<tr><td><label for="password">Password:</label></td><td><input type="password" name="password" id="password" required></td></tr>
		<tr><td><label for="city">City:</label></td><td><select id="city" name="city"><option value="toronto" required>Toronto</option></select></td></tr>
		<tr><td><label for="phonenumber">Phone Number:</label></td><td><input type="number" name="phonenumber" id="phonenumber" required></td></tr>
		<tr><td><input type="reset" value="Reset"></td><td><input type="submit" value="Register"></td></tr>			
	</table>		
</form>

