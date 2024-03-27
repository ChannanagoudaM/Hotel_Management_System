<%@ page import="com.example.OrderFoodProject.foods.Food_Menu" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<body>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Sl-No</th>
      <th scope="col">Food-Name</th>
      <th scope="col">Food-Type</th>
      <th scope="col">Food-Cost</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <c:forEach var="item" items="${objects}">
      
     <td>${item.id}</td>
     <td>${item.food_name}</td>
     <td>${item.food_type}</td>
     <td>${item.food_price}</td>
      
      </c:forEach>
    </tr>
   
  </tbody>
</table>

</body>
</html>

