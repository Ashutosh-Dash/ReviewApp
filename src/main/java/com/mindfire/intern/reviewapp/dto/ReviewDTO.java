/*
 * @ReviewDTO.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.dto;

/**
 * The ReviewDTO class can be used to contain the incoming data from
 * the user review form
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
public class ReviewDTO {

	private long userId;
	private long movieId;
	private short rating;
	private String review;

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @return the movieId
	 */
	public long getMovieId() {
		return movieId;
	}

	/**
	 * @return the rating
	 */
	public short getRating() {
		return rating;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(short rating) {
		this.rating = rating;
	}

	/**
	 * @param review
	 *            the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

}
