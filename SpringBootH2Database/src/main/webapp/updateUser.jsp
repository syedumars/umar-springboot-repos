<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploring H2 Database</title>
</head>
<body>
<h2>
${user} has been deleted successfully. Enter and update below info:
</h2>

<form action="addUser">
Enter ID =  <input type ="text" name="id"> <br>
Enter Name =  <input type ="text" name="name"> <br>
<input type = "submit"> <br>
</form>

</body>
</html>