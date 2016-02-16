/**
 * 
 */
package com.mindfire.intern.reviewapp.component;

import java.util.List;

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
	public List<Movie> getMovie(String movieTitle) {
		List<Movie> movie = movieRepository.findByMovieTitleContainingIgnoreCase(movieTitle);
		return movie;
	}
	
	public Movie getLastMovie(String movieTitle) {
		Movie movie = movieRepository.findFirstByMovieTitleOrderByMovieIdDesc(movieTitle);
		return movie;
	}
	
	@Transactional
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

}
