<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<title>New Dojo</title>
</head>
<body>
<h1>NEW DOJO</h1>


<form:form action="/create/dojo" method="post" modelAttribute="dojo">

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Name</span>
  <form:input path="name" name="name" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1"/>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>