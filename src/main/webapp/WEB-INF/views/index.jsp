<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
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
              <div class="col-sm-8">
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                  <!-- Indicators -->
                  <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                  </ol>

                  <!-- Wrapper for slides -->
                  <div class="carousel-inner" role="listbox">
                    <div class="item active">
                    <img src="resources/images/Latest-The-Force-Awakens-Trailer-Description.jpg" alt="Img">
                    </div>

                    <div class="item">
                      <img src="resources/images/Xmen.jpg" alt="Image">     
                    </div>

                    <div class="item">
                      <img src="resources/images/Fast-and-Furious-7-Full-Movie-Download1.jpg" alt="Image">
                    </div>
                  </div>

                  <!-- Left and right controls -->
                  <a class="left carousel-control" href="#myCarousel" role="button"
                     data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                  </a>
                  <a class="right carousel-control" href="#myCarousel" role="button"
                     data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                  </a>
                </div>
              </div>

              <div class="col-sm-4">
                <div class="well text-center">
                    <p><a href="#">Latest reviews</a></p>
                </div>

                <div class="well text-center">
                    <p><a href="#">Upcoming Movies</a></p>
                </div>

                <div class="well text-center">
                    <p><a href="#">Visit Our Blog</a></p>
                </div>
              </div>
            </div>
            <hr>
        </div>

        <div class="container text-center">    
          <h1 id="section-header">Movies Sections</h1>
          <br>
          <div class="row">
            <div class="col-sm-3">
                <a href="movielist">
                  <img src="resources/images/hollywood-sign1999_fnokt4ke2.jpg" class="img-responsive"
                  style="width:100%" alt="Image">
                </a>
            </div>

            <div class="col-sm-3"> 
                <a href="movielist">
                    <img src="resources/images/bollywood-indian-film-industry-9345238.jpg"
                    class="img-responsive" style="width:100%" alt="Image" />
                </a>  
            </div>

            <div class="col-sm-3">
              <div class="well">
                  <p><a href="#">Top rated</a></p>
              </div>

              <div class="well">
                  <p><a href="#">Latest releases</a></p>
              </div>
            </div>
            <div class="col-sm-3">
              <div class="well">
                  <p><a href="#">Most Reviewed</a></p>
              </div>

              <div class="well">
                  <p><a href="#">Categories</a></p>
              </div>
            </div>  
          </div>
          <hr>
        </div>

        <div class="container text-center">    
          <h3>Random collection</h3>
          <br>
          <div class="row">
            <div class="col-sm-2">
              <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>

            <div class="col-sm-2"> 
              <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>

            <div class="col-sm-2"> 
              <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>

            <div class="col-sm-2"> 
              <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>

            <div class="col-sm-2"> 
              <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
            </div>

            <div class="col-sm-2"> 
              <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive"
              style="width:100%" alt="Image">
            </div> 
          </div>
        </div><br>

        <footer class="container-fluid text-center">
          <p>Footer Text</p>
        </footer>

</body>
</html>
