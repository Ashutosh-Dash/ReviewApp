/**
 * 
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieProduction;
import com.mindfire.intern.reviewapp.repository.MovieProductionRepository;

/**
 * @author Ashutosh Dash
 *
 */
@Component
public class MovieProductionComponent {
	
	@Autowired
	private MovieProductionRepository movieProductionRepository;
	
	@Transactional
	public MovieProduction getMovieProduction(Movie movie) {
		return movieProductionRepository.findByMovie(movie);
	}
	
	@Transactional
	public MovieProduction saveMovieProduction(MovieProduction movieProduction){
		return movieProductionRepository.save(movieProduction);
	}

}
