/*
 * @MovieProductionComponent.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieProduction;
import com.mindfire.intern.reviewapp.repository.MovieProductionRepository;

/**The MovieProductionComponent class contains methods to interact with the corresponding
 * repository for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Component
public class MovieProductionComponent {
	
	@Autowired
	private MovieProductionRepository movieProductionRepository;
	
	/**
	 * This method uses repository method to retrieve a movie production
	 * details corresponding to the movie id
	 * @param movie A Movie object
	 * @return Returns A MovieProduction object
	 */
	@Transactional
	public MovieProduction getMovieProduction(Movie movie) {
		return movieProductionRepository.findByMovie(movie);
	}

	/**
	 * This method uses repository method to store the production details
	 * of a movie
	 * @param movieProduction A MovieProduction object
	 * @return Returns A MovieProduction object
	 */
	@Transactional
	public MovieProduction saveMovieProduction(MovieProduction movieProduction){
		return movieProductionRepository.save(movieProduction);
	}

}
