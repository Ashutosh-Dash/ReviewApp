/**
 * 
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.repository.MovieRepository;

/**
 * @author Ashutosh Dash
 *
 */
@Component
public class MovieComponent {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional
	public Movie getMovie(String movieTitle) {
		Movie movie = movieRepository.findByMovieTitle(movieTitle);
		return movie;
	}
	
	@Transactional
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

}
