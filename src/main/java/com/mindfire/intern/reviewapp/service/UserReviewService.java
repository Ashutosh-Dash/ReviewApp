/*
 * @UserReviewService.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.UserReviewComponent;
import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.UserDetail;
import com.mindfire.intern.reviewapp.domain.UserReview;
import com.mindfire.intern.reviewapp.dto.ReviewDTO;
import com.mindfire.intern.reviewapp.dto.UserNameAndReviews;

/**
 * The UserReviewService class contains methods for interaction between 
 * controller classes and UserReviewComponent class
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Service
public class UserReviewService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserReviewComponent userReviewComponent;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private UserDetailService userDetailService;
	
	/**
	 * This method returns a list of UserReview objects corresponding to the movie id
	 * @param movieId
	 * @return
	 */
	public List<UserReview> getReviews(long movieId) {
		Movie movie = movieService.findByMovieId(movieId);
		return userReviewComponent.getReviewByMovie(movie);
	}
	
	/**
	 * This method returns a list of UserReview objects corresponding to the movie id 
	 * and currently logged in user
	 * @param movieId
	 * @return
	 */
	public List<UserReview> getByUserAndMovie(long userId, long movieId) {
		UserDetail userDetail = userDetailService.findByUserId(userId);
		Movie movie = movieService.findByMovieId(movieId);
		return userReviewComponent.getReviewByUserAndMovie(userDetail, movie);
	}
	
	/**
	 * This method returns all reviews with corresponding user name for the given movieId
	 * @param movieId
	 * @return Returns a list of UserNameAndReviews objects
	 */
	public List<UserNameAndReviews> getNameReview(long movieId) {
		List<UserReview> reviews = this.getReviews(movieId);
		List<UserNameAndReviews> nameAndReviews = new ArrayList<>();
		Iterator<UserReview> itr = reviews.iterator();
		while(itr.hasNext()) {
			nameAndReviews.add(this.getNamesAndReviews(itr.next()));
		}
		return nameAndReviews;
	}
	
	/**
	 * This method calls the corresponding component class method to store
	 * the user review
	 * @param reviewDto
	 * @return
	 */
	public UserReview createUserReview(ReviewDTO reviewDto) {
		UserReview userReview = new UserReview();
		userReview.setUserDetail(userDetailService.findByUserId(reviewDto.getUserId()));
		userReview.setMovie(movieService.findByMovieId(reviewDto.getMovieId()));
		userReview.setReview(reviewDto.getReview());
		userReview.setRating(reviewDto.getRating());
		
		UserReview createdReview = userReviewComponent.saveUserReview(userReview);
		logger.info("user review added successfully");
		return createdReview;
	}
	
	/**
	 * This method returns user name, id, corresponding review and date added on
	 * @param userReview
	 * @return
	 */
	public UserNameAndReviews getNamesAndReviews(UserReview userReview) {
		UserNameAndReviews userNameAndReviews = new UserNameAndReviews();
		userNameAndReviews.setUserId(userReview.getUserDetail().getUserId());
		userNameAndReviews.setUserName(userDetailService.
				findByUserId(userReview.getUserDetail().getUserId()).getUserName());
		userNameAndReviews.setReview(userReview.getReview());
		userNameAndReviews.setAddedOn(userReview.getAddedOn());
		userNameAndReviews.setRating(userReview.getRating());
		return userNameAndReviews;
	}

}
