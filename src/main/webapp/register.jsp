<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel = "stylesheet" type= "text/css" href= "style.css">
</head>
<body>

<div class="container"></div>
<form action="RegisterServlet" method="post">
	<h1>Register</h1>
<label for = "username">Username:</label>	
<input type="text" name="username">
<label for = "email">Email:</label>	
<input type="email" name="username">
<label for = "password">Password:</label>	
<input type="password" name="username">
<button>Register</button>

<p><a href="index.html">Back to Home</a></p>
	
</form>

</body>
</html>