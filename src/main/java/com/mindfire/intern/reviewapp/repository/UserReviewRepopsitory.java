/*
 * @UserReviewRepopsitory.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.UserReview;

/**
 * The UserReviewRepopsitory interface is the repository for the
 * user_review table to be used for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Repository
public interface UserReviewRepopsitory extends JpaRepository<UserReview, Integer> {
	
	List<UserReview> findByMovie(Movie movie);

}
