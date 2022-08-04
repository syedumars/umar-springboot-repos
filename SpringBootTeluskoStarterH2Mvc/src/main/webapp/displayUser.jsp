<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my Telusko App - 2</title>
</head>
<body>

 <form action="home">
 <h2>Find your details of User you searched below:</h2> <br>
 ${alien} <br>
  <br>
 Id = ${alien.aid}  <br>
 Name = ${alien.aname} <br>
 Language liked = ${alien.tech} <br>

<input type="submit" value="back">
 </form>



</body>
</html>