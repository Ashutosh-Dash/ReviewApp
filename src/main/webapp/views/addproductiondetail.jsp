<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Addd Movie Production Details</title>
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
				<h1 id="section-head">Add movie production details</h1>
				<hr />
				<form:form commandName="movieProductionDto" class="form-horizontal">
					<fieldset>

						<div class="control-group">
							<label class="control-label">For movie</label>
							<div class="controls">
								<form:input path="movieId" placeholder="" 
								class="input-xlarge" value="${Id}" readonly="true"/>
								<p class="help-block">This id is auto generated for the movie</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">Director</label>
							<div class="controls">
								<form:input path="director" placeholder="" class="input-xlarge" />
								<p class="help-block">Enter the name of Director of the movie</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">Producer</label>
							<div class="controls">
								<form:input path="producer" placeholder="" class="input-xlarge" />
								<p class="help-block">Enter name of producer of the movie</p>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">Studio</label>
							<div class="controls">
								<form:input path="studio" placeholder="" class="input-xlarge" />
								<p class="help-block">Enter name of production studio</p>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">Production Budget</label>
							<div class="controls">
								<form:input path="budget" placeholder="" class="input-xlarge" />
								<p class="help-block">Enter the total production budget amount</p>
							</div>
						</div>

						<div class="control-group">
							<div class="controls">
								<button type="submit" class="btn btn-success">Add Production Detail</button>
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