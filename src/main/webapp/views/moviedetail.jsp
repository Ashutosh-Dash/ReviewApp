<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Movie Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css"></link>
<link href='https://fonts.googleapis.com/css?family=Merriweather:700'
	rel='stylesheet' type='text/css'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ratingstars.js"></script>
</head>
<body>

	<jsp:directive.include file="head.jsp" />

	<div id="myCarousel" class="carousel slide" data-ride="carousel">

		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
			<li data-target="#myCarousel" data-slide-to="4"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="${pageContext.request.contextPath}/${movieGalleryAsPath.carouselImage1}" alt="Image">
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/${movieGalleryAsPath.carouselImage2}" alt="Image">
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/${movieGalleryAsPath.carouselImage3}" alt="Image">
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/${movieGalleryAsPath.carouselImage4}" alt="Image">
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/${movieGalleryAsPath.carouselImage5}" alt="Image">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>


	<div class="container.fluid">
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10 section">
				<h1 id="section-head">${movie.movieTitle}</h1>
				<hr />

				<dl class="dl-horizontal">
					<dt>
						<strong>Description:</strong>
					</dt>
					<dd>${movie.description}</dd>

					<dt>
						<strong>Language:</strong>
					</dt>
					<dd>${movie.movieLanguage}</dd>

					<dt>
						<strong>Release date:</strong>
					</dt>
					<dd>${movie.releaseDate}</dd>

					<dt>
						<strong>Duration:</strong>
					</dt>
					<dd>${movie.duration} Minutes</dd>

					<dt>
						<strong>Youtube Trailer link:</strong>
					</dt>
					<dd><a href="${movie.trailerLink}">See Now</a></dd>

					<dt>
						<strong>Director:</strong>
					</dt>
					<dd>${movieProduction.director}</dd>

					<dt>
						<strong>Producer:</strong>
					</dt>
					<dd>${movieProduction.producer}</dd>

					<dt>
						<strong>Studio:</strong>
					</dt>
					<dd>${movieProduction.studio}</dd>

					<dt>
						<strong>Production budget:</strong>
					</dt>
					<dd>${movieProduction.productionBudget} million USD</dd>
				</dl>
				<br />
				<c:if test="${empty userInfo}">
					<div class="text-danger">
						You have to be logged in to post a review.
						<br />
						If you already have a TMC account then click on the <strong>Login</strong> button.
						<br />
						If you don't have an account the register now by clicking
						<a href="${pageContext.request.contextPath}/registration">here</a> or on the <strong>Join Us</strong> button.
					</div>
				</c:if>
				<c:if test="${not empty userInfo}">

					<form:form commandName="reviewDto"
					 action="${pageContext.request.contextPath}/submitReview" class="form-horizontal">

						<div class="control-group">
							<div class="controls">
								<form:hidden path="userId" value="${userInfo.userId}" class="input-xlarge" />
							</div>
						</div>

						<div class="control-group">
							<div class="controls">
								<form:hidden path="movieId"	value="${movie.movieId}" class="input-xlarge" />
							</div>
						</div>

						<div class="container">
							<div class="row"><h2>Rate:</h2></div>
							<div class="row lead">
								<div id="stars" class="starrr"></div>
								You gave a rating of <span id="count">0</span> star(s)
							</div>
						</div>

						<div class="control-group">
							<div class="controls">
								<form:hidden id="current-rating" path="rating" class="input-xlarge" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">
								Give us your review on this movie
							</label>
							<div class="controls">
								<form:textarea path="review" placeholder="" rows="10" 
								class="input-xlarge form-control" required="required" />
							</div>
						</div>
						
						<div class="control-group">
							<div class="controls">
								<button type="submit" class="btn btn-success">Submit Review</button>
							</div>
						</div>

					</form:form>

				</c:if>

				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<h1>User Comments</h1>
						</div>
						<!-- /col-sm-12 -->
					</div>
					<!-- /row -->
						<c:if test="${empty reviews}">
							<h1 class="text-danger">
								There is nothing to display here
							</h1>
						</c:if>
						<c:forEach var="userReview" items="${reviews}">
						<div class="row">
						<div class="col-sm-1"></div>

						<div class="col-sm-10">
							<div class="panel panel-primary">
								<div class="panel-heading">
									<strong>${userReview.userName}</strong>
									<small>commented on
										${userReview.addedOn}</small><br/>
									<c:forEach var="rating" begin="1" end="${userReview.rating}">
									<span class="glyphicon glyphicon-star"></span>
									</c:forEach>
									<c:forEach var="of" begin="${userReview.rating + 1}" end="5">
									<span class="glyphicon glyphicon-star-empty"></span>
									</c:forEach>
								</div>
								<div class="panel-body">${userReview.review}</div>
								<!-- /panel-body -->
							</div>
							<!-- /panel panel-default -->
						</div>
						<!-- /col-sm-5 -->

						<div class="col-sm-1"></div>
						</div>
						<!-- /row -->
						</c:forEach>

				</div>
				<!-- /container -->

			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<jsp:directive.include file="footertext.jsp" />

</body>
</html>