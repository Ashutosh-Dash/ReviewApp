<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Registration</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/common.css"></link>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="resources/js/confirmPassword.js" type="text/javascript"></script>
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
                    <form:form commandName="userDetailDto" class="form-horizontal" 
                    onsubmit="return passwordFunction(this);">
                      <fieldset>
                        ${message}
                        <div class="control-group">
                          <label class="control-label" for="username">Username</label>
                          <div class="controls">
                            <form:input path="userName" id="username" name="username" placeholder=""
                            class="input-xlarge" required="required" />
                            <p class="help-block">
                                Username can contain any letters or numbers, without spaces
                            </p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="username">First name</label>
                          <div class="controls">
                            <form:input path="firstName" id="username" name="firstname" placeholder=""
                            class="input-xlarge" />
                            <p class="help-block">Enter you first name</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="username">Last name</label>
                          <div class="controls">
                            <form:input path="lastName" id="username" name="lastname" placeholder=""
                            class="input-xlarge" />
                            <p class="help-block">Enter your last name</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="email">E-mail</label>
                          <div class="controls">
                            <form:input path="emailId" type="email" id="email" name="email" placeholder=""
                            class="input-xlarge" required="required" />
                            <p class="help-block">Please provide your E-mail</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="password">Password</label>
                          <div class="controls">
                            <form:password path="password" id="password" name="password"
                                   placeholder="" class="input-xlarge" pattern=".{8,16}" required="required" />
                            <p class="help-block">
                                Password should be at least 8 characters and 16 characters at maximum
                            </p>
                          </div>
                        </div>

                        <div class="control-group">
                          <label class="control-label" for="password_confirm">
                              Retype Password (Confirm)
                          </label>
                          <div class="controls">
                            <input type="password" id="password_confirm" pattern=".{8,16}"
                                name="password_confirm" placeholder="" class="input-xlarge" required="required" />
                            <p class="help-block">Please confirm password</p>
                          </div>
                        </div>
                        
                        <div class="control-group">
                          <label class="control-label" for="list">Secret Question</label>
                          <div class="controls">
                            <form:select path="secretQuestion" required="required">
                            	<form:option value="0" label="Select your secret question" />
                            	<form:options items="${questionList}" />
                            </form:select>
                            <p class="help-block">
                                Select a secret question to use in case you forget your password later
                            </p>
                          </div>
                        </div>
                        
                        <div class="control-group">
                          <label class="control-label" for="answer">Secret Answer</label>
                          <div class="controls">
                            <form:input path="secretAnswer" id="answer" name="answer" placeholder=""
                            class="input-xlarge" required="required" />
                            <p class="help-block">Enter answer to your secret question</p>
                          </div>
                        </div>

                        <div class="control-group">
                          <div class="controls">
                            <button type="submit" class="btn btn-success">Register</button>
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