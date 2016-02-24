<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>List of Movies</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/common.css"></link>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body>
        
        <jsp:directive.include file="head.jsp" />
        
        <div class="container">    
            <div class="row">
            	<c:if test="${empty results}">
            	<br /><br />
            	<h1 class="bg-primary">There are no results for your Query</h1>
            	<br /><br /><br /><br />
            	</c:if>
                <c:forEach var="movieResult" items="${results}">
                	<div class="col-sm-4">
                		<a href="${pageContext.request.contextPath}/moviedetail/${movieResult.movieId}">
                    		<div class="panel panel-primary">
                        		<div class="panel-heading">${movieResult.movieTitle }</div>
                        		<div class="panel-body">
                            		<img src="${movieResult.searchResultImage }"
                                 	class="img-responsive" style="width:100%" alt="Image">
                        		</div>
                    		</div>
                    	</a>
                	</div>
                </c:forEach>

            </div>
        </div>
        
        <jsp:directive.include file="footertext.jsp" />
        
    </body>
</html>