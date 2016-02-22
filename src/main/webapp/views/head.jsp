<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="jumbotron">
	<div class="container text-center">
		<h1>The Movie Club</h1>
	</div>
</div>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/index">TMC</a>
		</div>

		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}/index">Home</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false"> Movies <span class="caret"></span>
				</a>

					<ul class="dropdown-menu">
						<!-- Movies dropdown menu -->
						<li><a href="${pageContext.request.contextPath}/movielistB">Bollywood</a></li>
						<li><a href="${pageContext.request.contextPath}/movielistH">Hollwwood</a></li>
						<li role="separator" class="divider"></li>
						<li>
							<a href="${pageContext.request.contextPath}/movielistAllByDate">
								Latest Releases
							</a>
						</li>
						<li role="separator" class="divider"></li>
						<li><a href="movielist">Most Reviewed</a></li>
					</ul> <!-- End of dropdown menu --></li>
				<li><a href="${pageContext.request.contextPath}/aboutus">About us</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
			<form:form commandName="search" action="${pageContext.request.contextPath}/search"
				class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<form:input path="searchItem" class="form-control"
						placeholder="Search movies" />
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</form:form>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${not empty userInfo}">
						
						<c:if test="${userInfo.role=='admin' }">
						<li>
							<a href="addnewmovie">Add a new movie</a>
						</li>
						</c:if>
						<li>
							<a href="${pageContext.request.contextPath}/index">
								<span class="glyphicon glyphicon-user"> </span>
								${userInfo.userName}
							</a>
						</li>
						<li>
							<a href="logout">
								<span class="glyphicon glyphicon-log-out"> </span>
								Logout
							</a>
						</li>
					</c:when>
					<c:otherwise>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false">
								<span class="glyphicon glyphicon-log-in"> </span> Login
								<span class="caret"></span>
							</a>

							<ul class="dropdown-menu">
								<form:form commandName="logininfo" 
								action="${pageContext.request.contextPath}/login"
								class="form-signin lgin-frm">
									<li>
										<label for="inputEmail" class="sr-only">User name</label>
										<form:input path="userName" class="form-control"
											placeholder="Username" />
									</li>

									<li>
										<label for="inputPassword" class="sr-only">Password</label>
										<form:password path="password" id="inputPassword"
											class="form-control" placeholder="Password" />
									</li>

									<li>
										<button class="btn btn-lg btn-primary btn-block" type="submit">
											Login</button>
									</li>
									<li>
										<a href="${pageContext.request.contextPath}/forgotPW">
											Forgot Password
										</a>
									</li>
								</form:form>
							</ul>
						<li>
							<a href="${pageContext.request.contextPath}/registration">
							<span class="glyphicon glyphicon-user"> </span>
							Join us</a>
						</li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</nav>