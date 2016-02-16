<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

	<div class="container.fluid">
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10 section">
				<h1 id="section-head">Add a new movie</h1>
				<hr />
				<form:form commandName="movieDto" class="form-horizontal">
					<fieldset>

						<div class="control-group">
							<label class="control-label" for="movietitle">Movie Title</label>
							<div class="controls">
								<form:input path="movieTitle" placeholder="" 
								class="input-xlarge" />
								<p class="help-block">Enter the official movie title</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="movielanguage">Movie Language</label>
							<div class="controls">
								<form:input path="movieLanguage" placeholder="" class="input-xlarge" />
								<p class="help-block">Enter the original movie language</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="releasedate">Movie Release Date</label>
							<div class="controls">
								<form:input path="releaseDate" placeholder="" class="input-xlarge" />
								<p class="help-block">
								Enter the official movie release date (In format : mm/dd/yyyy)
								</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="duration">Movie Duration</label>
							<div class="controls">
								<form:input path="duration" placeholder="" class="input-xlarge" />
								<p class="help-block">Enter the duration of movie in minute</p>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="trailerlink">
								Official trailer Link
							</label>
							<div class="controls">
								<form:input path="trailerLink" placeholder="" class="input-xlarge" />
								<p class="help-block">Provide link of official movie trailer</p>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="username">Description</label>
							<div class="controls">
								<form:textarea path="description" placeholder="" class="input-xlarge" />
								<p class="help-block">A brief description of movie</p>
							</div>
						</div>

						<div class="control-group">
							<div class="controls">
								<button type="submit" class="btn btn-success">Add Movie Details</button>
							</div>
						</div>
					</fieldset>
				</form:form>
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>


</body>
</html>