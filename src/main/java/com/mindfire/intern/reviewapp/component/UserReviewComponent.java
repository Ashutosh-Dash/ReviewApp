/*
 * @UserReviewComponent.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.UserReview;
import com.mindfire.intern.reviewapp.repository.UserReviewRepopsitory;

/**
 * The UserReviewComponent class contains methods to interact with the corresponding
 * repository for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Component
public class UserReviewComponent {
	
	@Autowired
	private UserReviewRepopsitory userReviewRepopsitory;
	
	/**
	 * This method returns reviews for corresponding movie
	 * @param movie
	 * @return Returns a list of UserReview objects
	 */
	@Transactional
	public List<UserReview> getReviewByMovie(Movie movie) {
		return userReviewRepopsitory.findByMovie(movie);
	}
	
	@Transactional
	public UserReview saveUserReview(UserReview userReview) {
		return userReviewRepopsitory.save(userReview);
	}

}
