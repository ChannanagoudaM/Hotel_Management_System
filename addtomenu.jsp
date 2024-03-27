<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addfoodstomenu">

<h1>Welcome  <%=request.getAttribute("name") %></h1>

<input type="text" name="food_name" placeholder="Enter Food Name">
<br><br>
<input type="text" name="food_type" placeholder="Enter Food Type (Example:Veg || Non-Veg)">
<br><br>
<input type="text" name="food_price" placeholder="Enter Food Price">
<br><br>
<input type="submit">


</form>


</body>
</html>