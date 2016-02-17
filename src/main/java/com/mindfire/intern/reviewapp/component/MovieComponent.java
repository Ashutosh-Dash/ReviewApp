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
		return movieRepository.findByMovieTitleContainingIgnoreCase(movieTitle);
	}
	
	@Transactional
	public Movie getLastMovie() {
		return movieRepository.findFirstByOrderByMovieIdDesc();
	}
	
	@Transactional
	public Movie getMovieByMovieId(long movieId) {
		return movieRepository.findByMovieId(movieId);
	}
	
	@Transactional
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

}
