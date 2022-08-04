<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Syed's SpringBoot page</title>
</head>
<body>

<h1>This is Syed's Index Page.</h1>
Shaaheen 
${details.name}, 

${details.age}, 

${details.address}  <br>


Today's date: <%= (new java.util.Date()).toLocaleString()%>

</body>
</html>