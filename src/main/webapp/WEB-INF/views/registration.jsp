<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Registration</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <style><%@include file="../resources/css/style.css"%></style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="js/inserthead.js"></script>
    </head>
    <body>
        
        <jsp:directive.include file="head.jsp" />
        
        <div class="container.fluid">
            <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10 section">
                    <h1 id="section-head">Join us today</h1>
                    <hr />
                    <img alt="Image" src="resources/images/11179463ori.jpg" />
                    <form class="form-horizontal">
                      <fieldset>
                          
                        <div class="control-group">
                          <label class="control-label" for="username">Username</label>
                          <div class="controls">
                            <input type="text" id="username" name="username" placeholder=""
                            class="input-xlarge">
                            <p class="help-block">
                                Username can contain any letters or numbers, without spaces
                            </p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="username">First name</label>
                          <div class="controls">
                            <input type="text" id="username" name="username" placeholder=""
                            class="input-xlarge">
                            <p class="help-block">Enter you first name</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="username">Last name</label>
                          <div class="controls">
                            <input type="text" id="username" name="username" placeholder=""
                            class="input-xlarge">
                            <p class="help-block">Enter your last name</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="email">E-mail</label>
                          <div class="controls">
                            <input type="text" id="email" name="email" placeholder=""
                            class="input-xlarge">
                            <p class="help-block">Please provide your E-mail</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="password">Password</label>
                          <div class="controls">
                            <input type="password" id="password" name="password"
                                   placeholder="" class="input-xlarge">
                            <p class="help-block">
                                Password should be at least 8 characters
                            </p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="password_confirm">
                              Retype Password (Confirm)
                          </label>
                          <div class="controls">
                            <input type="password" id="password_confirm"
                                name="password_confirm" placeholder="" class="input-xlarge">
                            <p class="help-block">Please confirm password</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <div class="controls">
                            <button class="btn btn-success">Register</button>
                          </div>
                        </div>
                      </fieldset>
                    </form>
                </div>
                <div class="col-sm-1"></div>
            </div>
        </div>
        
        
        
        <footer class="container-fluid text-center">
          <p>Footer Text</p>
        </footer>
    
    </body>
</html>