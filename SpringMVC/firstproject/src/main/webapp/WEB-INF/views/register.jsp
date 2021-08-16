<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="<c:url value="/resources/registerStyle.css" />"
	rel="stylesheet" type='text/css'>
<title>Register</title>
</head>
<body>
	<div id="form" class="container mt-5 col-md-6" >
		<h2 class="text-center">Registration form</h2>
		<form action="processform" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">User Name</label> <input
					type="text" class="form-control" id="name" name="name" placeholder="Enter name">
			</div>
			<div class="mb-3">
				<label for="Email" class="form-label">Email address</label> <input
					type="email" class="form-control " id="Email" name="email" placeholder="Enter email">
			</div>
			<div class="mb-3">
				<label for="age" class="form-label">Age</label> <input
					type="text" class="form-control " id="age" name="age" placeholder="Enter age">
			</div>
			<div class="container mt-1 text-center ">
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</form>
	</div>

</body>
</html>