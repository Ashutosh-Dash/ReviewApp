/*
 * @MovieProductionRepository.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieProduction;

/**
 * The MovieProductionRepository interface is the repository for the
 * movie_production table to be used for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Repository
public interface MovieProductionRepository extends JpaRepository<MovieProduction, Integer> {

	MovieProduction findByMovie(Movie movie);
	
}
