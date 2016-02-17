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
	
	<div class="container.fluid">
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10 section">
				<h1 id="section-head">Add a new movie</h1>
				<hr />
				<form:form commandName="movieGalleryDto" enctype="multipart/form-data" 
					class="form-horizontal">
					<fieldset>

						<div class="control-group">
							<label class="control-label">Movie Id</label>
							<div class="controls">
								<form:input path="movieId" placeholder="" 
								class="input-xlarge" value="${Id}" readonly="true"/>
								<p class="help-block">This id is auto generated for the movie</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">
							Provide an image to appear in search results page
							</label>
							<div class="controls">
								<form:input type="file" path="searchResultImage" 
								placeholder="" class="input-xlarge" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">
							Provide an image to appear as first carousel image in movie detail page
							</label>
							<div class="controls">
								<form:input type="file" path="carouselImage1" 
								placeholder="" class="input-xlarge" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">
							Provide an image to appear as second carousel image in movie detail page
							</label>
							<div class="controls">
								<form:input type="file" path="carouselImage2" 
								placeholder="" class="input-xlarge" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">
							Provide an image to appear as third carousel image in movie detail page
							</label>
							<div class="controls">
								<form:input type="file" path="carouselImage3" 
								placeholder="" class="input-xlarge" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">
							Provide an image to appear as fourth carousel image in movie detail page
							</label>
							<div class="controls">
								<form:input type="file" path="carouselImage4" 
								placeholder="" class="input-xlarge" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">
							Provide an image to appear as fifth carousel image in movie detail page
							</label>
							<div class="controls">
								<form:input type="file" path="carouselImage5" 
								placeholder="" class="input-xlarge" />
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