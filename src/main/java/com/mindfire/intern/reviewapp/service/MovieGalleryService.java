/**
 * 
 */
package com.mindfire.intern.reviewapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.MovieGalleryComponent;
import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieGallery;
import com.mindfire.intern.reviewapp.dto.MovieGalleryAsPath;

/**
 * @author Ashutosh Dash
 *
 */
@Service
public class MovieGalleryService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MovieGalleryComponent movieGalleryComponent;
	
	@Autowired
	private MovieService movieService;
	
	public MovieGallery findByMovie(Movie movie) {
		return movieGalleryComponent.getMoviegallery(movie);
	}
	
	public MovieGallery createMovieGallery(MovieGalleryAsPath galleryAsPath) {
		
		long mid = galleryAsPath.getMovieId();
		MovieGallery movieGallery = new MovieGallery();
		
		movieGallery.setMovie(movieService.findByMovieId(mid));
		movieGallery.setSearchResultImage(galleryAsPath.getSearchResultImage());
		movieGallery.setCarouselImage1(galleryAsPath.getCarouselImage1());
		movieGallery.setCarouselImage2(galleryAsPath.getCarouselImage2());
		movieGallery.setCarouselImage3(galleryAsPath.getCarouselImage3());
		movieGallery.setCarouselImage4(galleryAsPath.getCarouselImage4());
		movieGallery.setCarouselImage5(galleryAsPath.getCarouselImage5());
		
		MovieGallery createdMovieGallery = 
				movieGalleryComponent.saveMovieGallery(movieGallery);
		logger.info("Movie gallery added");
		return createdMovieGallery;
	}

}
