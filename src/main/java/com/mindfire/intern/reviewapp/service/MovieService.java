/*
 * @MovieService.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.MovieComponent;
import com.mindfire.intern.reviewapp.controller.ReviewAppConstants;
import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.dto.MovieDTO;
import com.mindfire.intern.reviewapp.dto.MovieResult;

/**
 * The MovieService class contains methods for interaction between 
 * controller classes and MovieComponent class
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Service
public class MovieService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MovieComponent movieComponent;
	
	@Autowired
	private MovieGalleryService galleryService;
	
	/**
	 * This method retrieves a list of Movie objects where the movieTitle
	 * is similar to the input parameter
	 * @param movieTitle A string object
	 * @return Returns a list of Movie objects
	 */
	public List<Movie> findByMovieTitle(String movieTitle) {
		return movieComponent.getMovie(movieTitle);
	}
	
	public List<MovieResult> findResultByMovieTitle(String movieTitle) {
		List<Movie> movies = this.findByMovieTitle(movieTitle);
		List<MovieResult> movieResults = new ArrayList<>();
		Iterator<Movie> itr = movies.iterator();
		while(itr.hasNext()) {
			movieResults.add(this.addToMovieResult(itr.next()));
		}
		return movieResults;
	}
	
	/**
	 * This method retrieves a list of Movie objects where the movie language
	 * is same as the input parameter
	 * @param movieLanguage
	 * @return
	 */
	public List<Movie> findByMovieLanguage(String movieLanguage) {
		return movieComponent.getMovieByLanguage(movieLanguage);
	}
	
	/**
	 * This method returns the last movie details added to the database
	 * @return Returns a movie object
	 */
	public Movie getLastMovie() {
		return movieComponent.getLastMovie();
	}
	
	/**
	 * This method retrieves the movie details from database corresponding
	 * to the movie id
	 * @param movieId
	 * @return
	 */
	public Movie findByMovieId(long movieId) {
		return movieComponent.getMovieByMovieId(movieId);
	}
	
	/**
	 * This method calls the corresponding component class method to store
	 * the movie details
	 * @param movieDto A MovieDTO object
	 * @return Returns the created movie details as Movie object
	 */
	public Movie createMovie(MovieDTO movieDto) {
		Movie movie = new Movie();
		movie.setMovieTitle(movieDto.getMovieTitle());
		movie.setMovieLanguage(movieDto.getMovieLanguage());
		movie.setReleaseDate(movieDto.getReleaseDate());
		movie.setDuration(movieDto.getDuration());
		movie.setTrailerLink(movieDto.getTrailerLink());
		movie.setDescription(movieDto.getDescription());
		
		Movie createdmovie = movieComponent.saveMovie(movie);
		logger.info("Movie with name " + movieDto.getMovieTitle()
				+ " successfully added");
		
		return createdmovie;
	}
	
	public MovieResult addToMovieResult(Movie movie) {
		MovieResult movieResult = new MovieResult();
		movieResult.setMovieId(movie.getMovieId());
		movieResult.setMovieTitle(movie.getMovieTitle());
		movieResult.setSearchResultImage(this.relativePath(galleryService.
				findByMovie(movie).getSearchResultImage()));
		return movieResult;
	}
	
	public String relativePath(String absolutePath) {
		Path pathA = Paths.get(absolutePath);
		Path pathB = Paths.get(ReviewAppConstants.BASE_PATH);
		Path pathR = pathB.relativize(pathA);
		return pathR.toString();
	}

}
