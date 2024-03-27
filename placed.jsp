<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Your Order Name : <%=request.getAttribute("name") %> Is Placed. Please Wait For 10Mins</h1>
<h1>To GoBack To Menu</h1>

<form action="menu">
<input type="submit" name="Press">
</form>
</body>
</html>