/**
 * 
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
	
	public MovieProduction findByMovie(Movie movie) {
		return movieProductionComponent.getMovieProduction(movie);
	}
	
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
