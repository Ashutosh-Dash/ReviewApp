
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
			<a class="navbar-brand" href="index.jsp">TMC</a>
		</div>

		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li><a href="index.jsp">Home</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false"> Movies <span class="caret"></span>
				</a>

					<ul class="dropdown-menu">
						<!-- Movies dropdown menu -->
						<li><a href="movielist.jsp">Bollywood</a></li>
						<li><a href="movielist.jsp">Hollwwood</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Latest Releases</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Most Reviewed</a></li>
					</ul> <!-- End of dropdown menu --></li>
				<li><a href="#">About us</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search movies">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false"> <span class="glyphicon glyphicon-log-in"></span>
						Login <span class="caret"></span>
				</a>

					<ul class="dropdown-menu">
						<form class="form-signin lgin-frm">
							<li><label for="inputEmail" class="sr-only">Email
									address</label> <input type="email" id="inputEmail"
								class="form-control" placeholder="Email address" required
								autofocus></li>

							<li><label for="inputPassword" class="sr-only">Password</label>
								<input type="password" id="inputPassword" class="form-control"
								placeholder="Password" required></li>

							<li>
								<div class="checkbox">
									<label> <input type="checkbox" value="remember-me">
										Remember me
									</label>
								</div>
							</li>

							<li>
								<button class="btn btn-lg btn-primary btn-block" type="submit">
									Login</button>
							</li>
							<li><a href="forgotPW.jsp">Forgot Password</a></li>
						</form>
					</ul>
				<li><a href="registration.jsp"><span
						class="glyphicon glyphicon-user"> </span> Join us </a></li>
			</ul>
		</div>
	</div>
</nav>