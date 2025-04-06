<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel = "stylesheet" type= "text/css" href= "style.css">
</head>
<body>

<div class="container"></div>
<form action="LoginServlet" method="post">
<h1>Login</h1>
<label for = "username">Username:</label>	
<input type="text" name="username">
<label for = "password">Password:</label>	
<input type="password" name="username">
<button>Login</button>

<p><a href="index.html">Back to Home</a></p>

<% String error = request.getParameter("error");

if (error != null && error.equals("1")){ %>

 <p style = "color : red"> Invalid Credentials</p>
 <% } %>

	
</form>

</body>
</html>