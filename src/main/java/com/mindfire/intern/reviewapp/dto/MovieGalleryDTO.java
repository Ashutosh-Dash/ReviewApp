/*
 * @MovieGalleryDTO.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * The MovieGalleryDTO class can be used to contain the incoming data from
 * movie gallery form
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
public class MovieGalleryDTO {

	private long movieId;
	private MultipartFile searchResultImage;
	private MultipartFile carouselImage1;
	private MultipartFile carouselImage2;
	private MultipartFile carouselImage3;
	private MultipartFile carouselImage4;
	private MultipartFile carouselImage5;

	/**
	 * @return the movieId
	 */
	public long getMovieId() {
		return movieId;
	}

	/**
	 * @return the searchResultImage
	 */
	public MultipartFile getSearchResultImage() {
		return searchResultImage;
	}

	/**
	 * @return the carouselImage1
	 */
	public MultipartFile getCarouselImage1() {
		return carouselImage1;
	}

	/**
	 * @return the carouselImage2
	 */
	public MultipartFile getCarouselImage2() {
		return carouselImage2;
	}

	/**
	 * @return the carouselImage3
	 */
	public MultipartFile getCarouselImage3() {
		return carouselImage3;
	}

	/**
	 * @return the carouselImage4
	 */
	public MultipartFile getCarouselImage4() {
		return carouselImage4;
	}

	/**
	 * @return the carouselImage5
	 */
	public MultipartFile getCarouselImage5() {
		return carouselImage5;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	/**
	 * @param searchResultImage
	 *            the searchResultImage to set
	 */
	public void setSearchResultImage(MultipartFile searchResultImage) {
		this.searchResultImage = searchResultImage;
	}

	/**
	 * @param carouselImage1
	 *            the carouselImage1 to set
	 */
	public void setCarouselImage1(MultipartFile carouselImage1) {
		this.carouselImage1 = carouselImage1;
	}

	/**
	 * @param carouselImage2
	 *            the carouselImage2 to set
	 */
	public void setCarouselImage2(MultipartFile carouselImage2) {
		this.carouselImage2 = carouselImage2;
	}

	/**
	 * @param carouselImage3
	 *            the carouselImage3 to set
	 */
	public void setCarouselImage3(MultipartFile carouselImage3) {
		this.carouselImage3 = carouselImage3;
	}

	/**
	 * @param carouselImage4
	 *            the carouselImage4 to set
	 */
	public void setCarouselImage4(MultipartFile carouselImage4) {
		this.carouselImage4 = carouselImage4;
	}

	/**
	 * @param carouselImage5
	 *            the carouselImage5 to set
	 */
	public void setCarouselImage5(MultipartFile carouselImage5) {
		this.carouselImage5 = carouselImage5;
	}

}
