/*
 * @MovieResult.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.dto;

/**
 * This class can be used to contain movie id, movie title and search result
 * image path
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
public class MovieResult {

	private long movieId;
	private String movieTitle;
	private String searchResultImage;

	/**
	 * @return the movieId
	 */
	public long getMovieId() {
		return movieId;
	}

	/**
	 * @return the movieTitle
	 */
	public String getMovieTitle() {
		return movieTitle;
	}

	/**
	 * @return the searchResultImage
	 */
	public String getSearchResultImage() {
		return searchResultImage;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	/**
	 * @param movieTitle
	 *            the movieTitle to set
	 */
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	/**
	 * @param searchResultImage
	 *            the searchResultImage to set
	 */
	public void setSearchResultImage(String searchResultImage) {
		this.searchResultImage = searchResultImage;
	}

}
