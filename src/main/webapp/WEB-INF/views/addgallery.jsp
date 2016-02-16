<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
<title>Movie Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/common.css"></link>
<link href='https://fonts.googleapis.com/css?family=Merriweather:700'
	rel='stylesheet' type='text/css'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

	<jsp:directive.include file="head.jsp" />
	
	<p>${movieProdDto.movieId}</p>
	<p>${movieProdDto.director}</p>
	<p>${movieProdDto.producer}</p>
	<p>${movieProdDto.studio}</p>
	<p>${movieProdDto.budget}</p>
	
	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>