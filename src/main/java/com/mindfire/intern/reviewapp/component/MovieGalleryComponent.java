/*
 * @MovieGalleryComponent.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieGallery;
import com.mindfire.intern.reviewapp.repository.MovieGalleryRepository;

/**
 * The MovieGalleryComponent class contains methods to interact with the corresponding
 * repository for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Component
public class MovieGalleryComponent {
	
	@Autowired
	private MovieGalleryRepository movieGalleryRepository;
	
	/**
	 * This method uses repository method to retrieve a movie image
	 * gallery corresponding to the movie id
	 * @param movie A Movie object
	 * @return Returns a MovieGalery object
	 */
	@Transactional
	public MovieGallery getMoviegallery(Movie movie) {
		return movieGalleryRepository.findByMovie(movie);
	}
	
	/**
	 * This method uses repository method to store the path of images
	 * of a movie gallery
	 * @param movieGallery A MovieGallery object
	 * @return Returns a MovieGallery object
	 */
	@Transactional
	public MovieGallery saveMovieGallery(MovieGallery movieGallery) {
		return movieGalleryRepository.save(movieGallery);
	}

}
