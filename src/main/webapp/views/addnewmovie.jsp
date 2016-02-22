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
<link rel="stylesheet" type="text/css" href="resources/css/jquery-ui.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/jquery-ui.structure.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/jquery-bootstrap-datepicker.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="resources/js/jquery-ui.min.js" type="text/javascript"></script>
<script src="resources/js/custom-datepickerz.js" type="text/javascript"></script>
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
								class="input-xlarge" required="required" />
								<p class="help-block">Enter the official movie title</p>
							</div>
						</div>

						<div class="control-group">
                          <label class="control-label" for="movielanguage">Movie Language</label>
                          <div class="controls">
                            <form:select path="movieLanguage" required="required">
                            	<form:option value="" label="Select language" />
                            	<form:option value="hindi" label="Hindi" />
                            	<form:option value="english" label="English" />
                            </form:select>
                            <p class="help-block">Select official movie language</p>
                          </div>
                        </div>

						<div class="control-group">
							<label class="control-label" for="releasedate">Movie Release Date</label>
							<div class="controls">
								<form:input path="releaseDate" id="datepicker" placeholder="" 
								class="input-xlarge" required="required" />
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
							<label class="control-label">Description</label>
							<div class="controls">
								<form:textarea path="description" placeholder="" rows="10"
								class="input-xlarge form-control" />
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

	<jsp:directive.include file="footertext.jsp" />


</body>
</html>