/**
 * 
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieGallery;
import com.mindfire.intern.reviewapp.repository.MovieGalleryRepository;

/**
 * @author Ashutosh Dash
 *
 */
@Component
public class MovieGalleryComponent {
	
	@Autowired
	private MovieGalleryRepository movieGalleryRepository;
	
	@Transactional
	public MovieGallery getMoviegallery(Movie movie) {
		return movieGalleryRepository.findByMovie(movie);
	}
	
	@Transactional
	public MovieGallery saveMovieGallery(MovieGallery movieGallery) {
		return movieGalleryRepository.save(movieGallery);
	}

}
