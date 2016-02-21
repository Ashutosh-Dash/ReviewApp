/*
 * @MovieProductionService.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.MovieProductionComponent;
import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieProduction;
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;

/**
 * The MovieProductionService class contains methods for interaction between 
 * controller classes and MovieProductionComponent class
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Service
public class MovieProductionService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MovieProductionComponent movieProductionComponent;
	
	@Autowired
	private MovieService movieService;
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve a movie production detail from its id
	 * @param movie A Movie object as movie id
	 * @return Returns a MovieProduction object
	 */
	public MovieProduction findByMovie(Movie movie) {
		return movieProductionComponent.getMovieProduction(movie);
	}
	
	/**
	 * This method calls the corresponding component class method to store
	 * the production details corresponding to the movie id
	 * @param movieProductionDto A MovieProductionDTO object
	 * @return Returns a MoviePruduction object
	 */
	public MovieProduction createMovieProduction(MovieProductionDTO movieProductionDto) {
		MovieProduction movieProduction = new MovieProduction();
		movieProduction.setMovie(movieService.findByMovieId(movieProductionDto.getMovieId()));
		movieProduction.setDirector(movieProductionDto.getDirector());
		movieProduction.setProducer(movieProductionDto.getProducer());
		movieProduction.setStudio(movieProductionDto.getStudio());
		movieProduction.setProductionBudget(movieProductionDto.getBudget());
		
		MovieProduction createdMovieProduction = 
				movieProductionComponent.saveMovieProduction(movieProduction);
		logger.info("Movie production detail added");
		return createdMovieProduction;
	}

}
