<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<title>New Ninja</title>
</head>
<body>

<h1>New Ninja</h1>
<form:form action="/create/ninja" method="post" modelAttribute="ninja">

<form:select path="dojo" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
  
  
<c:forEach items="${dojos}" var="dojo">
<form:option value="${dojo.id}">${dojo.name}</form:option>
</c:forEach>
    
  
</form:select>
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">First Name</span>
  <form:input path="firstName" type="text" class="form-control" placeholder="Chuck" aria-label="Username" aria-describedby="basic-addon1"/>
</div>
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Last Name</span>
  <form:input path="lastName" type="text" class="form-control" placeholder="Norris" aria-label="Username" aria-describedby="basic-addon1"/>
</div>

<button type="submit" class="btn btn-primary">Submit</button>
</form:form>

</body>
</html>