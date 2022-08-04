<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploring H2 Database</title>
</head>
<body>

<h2>Add User below:</h2>
<form action="addUser">
Enter ID =  <input type ="text" name="id"> <br>
Enter Name =  <input type ="text" name="name"> <br>
<input type = "submit"> <br>
</form>

<h2>Get User below:</h2>
<form action="getUser">
Enter ID =  <input type ="text" name="id"> <br>
<input type = "submit"> <br>
</form>


<h2>Delete User below:</h2>
<form action="deleteUser">
Enter ID =  <input type ="text" name="id"> <br>
<input type = "submit"> <br>
</form>


<h2>Update User below:</h2>
<form action="updateUser">
Enter ID =  <input type ="text" name="id"> <br>
<input type = "submit"> <br>
</form>


</body>
</html>