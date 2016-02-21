/*
 * @MovieGalleryService.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
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
 * The MovieGalleryService class contains methods for interaction between 
 * controller classes and MovieGalleryComponent class
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
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve a movie image gallery from its id
	 * @param movie A Movie object as movie id
	 * @return Returns a MovieGallery object
	 */
	public MovieGallery findByMovie(Movie movie) {
		return movieGalleryComponent.getMoviegallery(movie);
	}
	
	public MovieGalleryAsPath findRelativePathByMovie(Movie movie) {
		MovieGallery movieGallery = movieGalleryComponent.getMoviegallery(movie);
		MovieGalleryAsPath movieGalleryAsPath = new MovieGalleryAsPath();
		movieGalleryAsPath.setMovieId(movie.getMovieId());
		movieGalleryAsPath.setSearchResultImage(movieService.relativePath(movieGallery.getSearchResultImage()));
		movieGalleryAsPath.setCarouselImage1(movieService.relativePath(movieGallery.getCarouselImage1()));
		movieGalleryAsPath.setCarouselImage2(movieService.relativePath(movieGallery.getCarouselImage2()));
		movieGalleryAsPath.setCarouselImage3(movieService.relativePath(movieGallery.getCarouselImage3()));
		movieGalleryAsPath.setCarouselImage4(movieService.relativePath(movieGallery.getCarouselImage4()));
		movieGalleryAsPath.setCarouselImage5(movieService.relativePath(movieGallery.getCarouselImage5()));
		return movieGalleryAsPath;
	}
	
	/**
	 * This method calls the corresponding component class method to store
	 * the absolute paths of the images corresponding to the movie id
	 * @param galleryAsPath A MovieGalleryAsPath object
	 * @return Returns the created movie gallery as MoVieGallery object
	 */
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
