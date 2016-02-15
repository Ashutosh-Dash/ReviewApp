<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
<title>Movie Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style><%@ include file="../resources/css/style.css" %></style>
<link href='https://fonts.googleapis.com/css?family=Merriweather:700'
	rel='stylesheet' type='text/css'>
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
				<h1 id="section-head">Movie added success fully</h1><br /><br /><br />
				Movie title : ${movieDto.movieTitle}<br />
				Movie language : ${movieDto.movieLanguage}<br />
				Release date : ${movieDto.releaseDate}<br />
				Duration : ${movieDto.duration}<br />
				Trailer Link : ${movieDto.trailerLink}<br />
				Description : ${movieDto.description}<br /><br /><br />
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>