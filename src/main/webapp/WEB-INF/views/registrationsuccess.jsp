<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Registration</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style><%@ include file = "../resources/css/style.css" %></style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

	<jsp:directive.include file="head.jsp" />

	<div class="container.fluid">
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10 section">
				<h1 id="section-head">Successful Registration</h1>
				<br /> User Name: ${userInformation.userName}<br /> First Name:
				${userInformation.firstName}<br /> Last Name:
				${userInformation.lastName}<br /> E-mail Id:
				${userInformation.emailId}<br />
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>