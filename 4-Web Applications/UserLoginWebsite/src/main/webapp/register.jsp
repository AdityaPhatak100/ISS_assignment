<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="styles.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
</head>
<body>

	<div class="container" >

	<form class="login-register" id="registration" action="Register" method="post">
		<h3 class="heading" >User Registration</h3>
	
		<label for="username" id="usernamelabel">Enter Username</label> <br>
		<input type="text" name="username" id="username"> <br>
		<p style="color: red;" id="username_error" class="error" ></p>
		
		<label for="password" id="passwordlabel">Enter Password</label> <br>
		<input type="password" name="password" id="password"> <br>
		<p style="color: red;" id="password_error" class="error"></p>
		
		<label for="repassword" id="repasswordlabel">Re-enter Password</label>	<br>	
		<input type="password" name="repassword" id="repassword"> <br>
		<p style="color: red;max-width:20rem;" id="repassword_error" class="error"></p>
		
		<input class="login-register-btn" type="submit" value="Register"> <br>
		Account already exists? <a href="login.jsp" >Login</a>
		
	</form>
	
	
	<h2 style="color: red;">
	<% 

	String exists = (String) session.getAttribute("usernameExists");
	if (exists != null) { out.println(exists); }
	session.removeAttribute("usernameExists"); 

	%>
	</h2>
	</div>
	
	<script type="text/javascript" src="registerValidate.js"></script>

</body>
</html>