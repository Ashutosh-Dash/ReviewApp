<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Movie Details</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet"
              href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/common.css"></link>
        <link href='https://fonts.googleapis.com/css?family=Merriweather:700' rel='stylesheet'
              type='text/css'>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body>
    
        <jsp:directive.include file="head.jsp" />
        
        <h1 class=""></h1>
        
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
                    <img src="resources/images/TheDarkKnight/1.jpg" alt="Image">
                </div>

                <div class="item">
                    <img src="resources/images/TheDarkKnight/2.jpg" alt="Image"> 
                </div>
                
                <div class="item">
                    <img src="resources/images/TheDarkKnight/3.jpg" alt="Image">
                </div>
                
                <div class="item">
                    <img src="resources/images/TheDarkKnight/4.jpg" alt="Image">
                </div>
                
                <div class="item">
                    <img src="resources/images/TheDarkKnight/5.jpg" alt="Image">    
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        
        
        <div class="container.fluid">
            <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10 section">
                    <h1 id="mn-head">The Dark Knight</h1>
                </div>
                <div class="col-sm-1"></div>
            </div>
        </div>
        
        <footer class="container-fluid text-center">
          <p>Footer Text</p>
        </footer>
        
    </body>
</html>