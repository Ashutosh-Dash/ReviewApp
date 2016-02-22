/*
 * @MovieRepository.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.Movie;

/**
 * The MovieRepository interface is the repository for the
 * movie table to be used for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByMovieTitleContainingIgnoreCaseOrderByReleaseDateDesc(String movieTitle);
	
	List<Movie> findByMovieLanguageContainingIgnoreCaseOrderByReleaseDateDesc(String movieLanguage);
	
	Movie findByMovieId(long movieId);
	
	Movie findFirstByOrderByMovieIdDesc();

}
