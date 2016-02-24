<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Invalid login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/common.css"></link>
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
				<h1 id="section-head">Invalid Login</h1>
				<hr />
				<br />
				<br />
				<br /> User name or password is not valid <br />
				<br />
				<br /> Don't have an account?<br /> <a class="btn btn-primary"
					href="registration" role="button"> Click here to register now </a><br />
				<br />
				<br />

			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<jsp:directive.include file="footertext.jsp" />

</body>
</html>