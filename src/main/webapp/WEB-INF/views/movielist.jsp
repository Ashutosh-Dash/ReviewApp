<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>List of Movies</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <style><%@include file="../resources/css/style.css"%></style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body>
        
        <jsp:directive.include file="head.jsp" />
        
        <div class="container">    
            <div class="row">

                <div class="col-sm-4">
                	<a href="moviedetail">
                    	<div class="panel panel-primary">
                        	<div class="panel-heading">Dawn of Justice</div>
                        	<div class="panel-body">
                            	<img src="resources/images/bm-vs-sm.jpg"
                                 	class="img-responsive" style="width:100%" alt="Image">
                        	</div>
                        	<div class="panel-footer">
                            	Catch the action when Superman meets Batman
                        	</div>
                    	</div>
                    </a>
                </div>

                <div class="col-sm-4"> 
                    <div class="panel panel-primary">
                        <div class="panel-heading">Terminator Genesys</div>
                        <div class="panel-body">
                            <img src="resources/images/trm-gen.jpg"
                                 class="img-responsive" style="width:100%" alt="Image">
                        </div>
                        <div class="panel-footer">He is back!</div>
                    </div>
                </div>

                <div class="col-sm-4"> 
                    <div class="panel panel-primary">
                        <div class="panel-heading">Jurassic World</div>
                        <div class="panel-body">
                            <img src="resources/images/Jurassic-World.jpg"
                                 class="img-responsive" style="width:100%" alt="Image">
                        </div>
                        <div class="panel-footer">We woke them up after 50 million years</div>
                    </div>
                </div>

            </div>
        </div>

        <br>

        <div class="container">    
            <div class="row">

                <div class="col-sm-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">WALL-E</div>
                        <div class="panel-body">
                            <img src="resources/images/wall-e.jpg"
                                 class="img-responsive" style="width:100%" alt="Image">
                        </div>
                        <div class="panel-footer">Wall-E and Eve's adventure to save Earth!</div>
                    </div>
                </div>

                <div class="col-sm-4"> 
                    <div class="panel panel-primary">
                        <div class="panel-heading">Bahubali: TheBeginning</div>
                        <div class="panel-body">
                            <img src="resources/images/bahubali.jpg"
                                 class="img-responsive" style="width:100%" alt="Image">
                        </div>
                        <div class="panel-footer">India's biggest blockbuster</div>
                    </div>
                </div>

                <div class="col-sm-4"> 
                    <div class="panel panel-primary">
                        <div class="panel-heading">ABCD</div>
                        <div class="panel-body">
                            <img src="resources/images/abcd.jpg"
                                 class="img-responsive" style="width:100%" alt="Image">
                        </div>
                        <div class="panel-footer">Any Body Can Dance</div>
                    </div>
                </div>

            </div>
        </div>
        
        <footer class="container-fluid text-center">
          <p>Footer Text</p>
        </footer>
        
    </body>
</html>