<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To Ganesh Hotel</title>
</head>
<body>

<form action="employee">

<h1>Add Hotel Employee</h1>

<input type="text" name="name" placeholder="Enter Employee Name">
<br><br>
<input type="text" name="code" placeholder="Enter 3 Digit Code">
<br><br>
<input type="submit">
</form>

<form action="customer">

<h1>Add Customers</h1>

<input type="text" name="name" placeholder="Enter Customer Name">
<br><br>
<input type="text" name="mail" placeholder="Enter Customer E-mail">
<br><br>
<input type="text" name="mobNumber" placeholder="Enter 10 Digit Mobile Number">
<br><br>
<input type="submit">

</form>

<form action="addFoods">
<h1>To Add Foods To Food Menu</h1>
<input type="text" name="code" placeholder="Enter Employee Code">
<br><br>
<input type="submit">
</form>



<form action="menu">

<h1>Menu</h1>
<input type="submit">

</form>


<form action="order">
<h2>Please Enter the Id of the Food present in Menu page and Submit To Place The Order</h2>

<input type="text" name="id" placeholder="Enter Food Id">
<br><br>
<input type="submit">

<input>

</form>

<h1>To See All Today's All Orders Enter Employee Code</h1>
<form action="total">


<input type="text" name="code" placeholder="Enter Employee Code">>
<br><br>
<input type="submit">

</form>

</body>
</html>