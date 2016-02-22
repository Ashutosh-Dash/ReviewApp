/*
 * @MovieComponent.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.repository.MovieRepository;

/**
 * The MovieComponent class contains methods to interact with the corresponding
 * repository for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Component
public class MovieComponent {
	
	@Autowired
	private MovieRepository movieRepository;
	
	/**
	 * This method uses repository method to retrieve a list of movie
	 * objects that has similar movieTitle value as input parameter
	 * @param movieTitle A String
	 * @return Returns a list of Movie objects
	 */
	@Transactional
	public List<Movie> getMovie(String movieTitle) {
		return movieRepository.findByMovieTitleContainingIgnoreCaseOrderByReleaseDateDesc(movieTitle);
	}
	
	/**
	 * This method uses repository method to retrieve a list of movie
	 * objects that has the movie language as input parameter
	 * @param movieLanguage
	 * @return
	 */
	@Transactional
	public List<Movie> getMovieByLanguage(String movieLanguage) {
		return movieRepository.
				findByMovieLanguageContainingIgnoreCaseOrderByReleaseDateDesc(movieLanguage);
	}
	
	/**
	 * This method uses repository method to retrieve an object of Movie
	 * class from database that has the highest value of movie id
	 * @return Returns a Movie object
	 */
	@Transactional
	public Movie getLastMovie() {
		return movieRepository.findFirstByOrderByMovieIdDesc();
	}
	
	/**
	 * This method uses repository method to retrieve movie details
	 * that has the movie id as input parameter
	 * @param movieId
	 * @return
	 */
	@Transactional
	public Movie getMovieByMovieId(long movieId) {
		return movieRepository.findByMovieId(movieId);
	}
	
	/**
	 * This method uses repository method to store movie details to
	 * the database
	 * @param movie
	 * @return
	 */
	@Transactional
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

}
