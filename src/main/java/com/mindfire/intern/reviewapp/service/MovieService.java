/**
 * 
 */
package com.mindfire.intern.reviewapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.MovieComponent;
import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.dto.MovieDTO;

/**
 * @author Ashutosh Dash
 *
 */
@Service
public class MovieService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MovieComponent movieComponent;
	
	public Movie findByMovieTitle(String movieTitle) {
		return movieComponent.getMovie(movieTitle);
	}
	
	public void createMovie(MovieDTO movieDto) {
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
	}

}
