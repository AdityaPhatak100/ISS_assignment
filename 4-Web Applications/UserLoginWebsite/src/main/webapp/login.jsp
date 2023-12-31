<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="styles.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
</head>
<body>
	
	<div class="container" >
	<form class="login-register" id="login" action="Login" method="post">
		<h3 class="heading" >User Login</h3>
	
		<label for="username" id="usernamelabel">Username</label><br>
		<input type="text" name="username" id="username"> <br>
		<p style="color: red;" id="username_error" class="error" ></p>

		<label for="password" id="passwordlabel">Password</label><br>
		<input type="password" name="password" id="password"> <br>
		<p style="color: red;" id="password_error" class="error" ></p>
		
		<input class="login-register-btn" type="submit" value="Login"> <br>
		New User? <a href="register.jsp">Register</a>
				
		
	</form>
	<h3 style="color: red;">
	
	<% 
	String loginerror = (String) session.getAttribute("loginerror");
	if (loginerror != null) { out.println(loginerror); }
	session.removeAttribute("loginerror"); 
	%>
	
	</h3>
	
	</div>
	
	<script type="text/javascript" src="loginValidate.js"></script>
	
</body>
</html>