/*
 * @UserNameAndReviews.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.dto;

import java.util.Date;

/**
 * The UserNameAndReviews class can be used to contain user name and user review
 * on the corresponding movie id
 * 
 * @author Ashutosh Dash
 *
 */
public class UserNameAndReviews {

	private long userId;
	private String userName;
	private String review;
	private Date addedOn;
	private short rating;

	/**
	 * @return the rating
	 */
	public short getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(short rating) {
		this.rating = rating;
	}

	/**
	 * @return the addedOn
	 */
	public Date getAddedOn() {
		return addedOn;
	}

	/**
	 * @param addedOn the addedOn to set
	 */
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
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
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param review
	 *            the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

}
