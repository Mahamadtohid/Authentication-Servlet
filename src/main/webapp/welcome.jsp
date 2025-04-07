<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "jakarta.servlet.http.HttpSession " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel = "stylesheet" type= "text/css" href= "index.css">
</head>
<body>
<%

	HttpSession session1 = request.getSession();

	if(session1 != null && session1.getAttribute("username") != null){
		String username = (String) session1.getAttribute("username");
    
	
   
   %>
    
<div class="container">
    <h1>Welcome Page</h1>
    
    	<h1><%= username %></h1>
        <a href="logout.jsp">Logout</a>
        
        
        <% 
        
        } else {
        	
        	response.sendRedirect("login.jsp");
        	
        }
        
        %>
    
</div>

</body></html>