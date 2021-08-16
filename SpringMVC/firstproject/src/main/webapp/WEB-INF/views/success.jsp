<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="<c:url value="/resources/successStyle.css" />"
	rel="stylesheet" type='text/css'>
<title>Success</title>
</head>
<body>
	<div id="emp" class="container text-center">
		<h1>Employee List</h1>
		<hr>

		<table style="width: 100%">
			<tr>
				<th class="text-center">USER NAME</th>
				<th class="text-center">EMAIL</th>
				<th class="text-center">AGE</th>
			</tr>
			<tr>
				<td>${emp.name}</td>
				<td>${emp.email}</td>
				<td>${emp.age}</td>
			</tr>
		</table>

		<div class="container mt-1 text-center ">
			<a class="btn btn-primary" href="/firstproject">Back to home</a>
		</div>
	</div>
</body>
</html>