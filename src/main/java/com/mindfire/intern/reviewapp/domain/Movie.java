/*
 * @Movie.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 * The Movie class is an entity class that represents the model of
 * the table movie in the database
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Entity
@Table(name = "movie")
@NamedNativeQuery(name = "Movie.findAll", query = "SELECT m from Movie m")
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private long movieId;

	@Column(name = "movie_title", nullable = false)
	private String movieTitle;

	@Column(name = "movie_language", nullable = false)
	private String movieLanguage;

	@Column(name = "release_date", columnDefinition = "date")
	private Date releaseDate;

	@Column
	private short duration;

	@Column(name = "trailer_link")
	private String trailerLink;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(name = "overall_rating")
	private short overalRating;

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
	 * @return the movieLanguage
	 */
	public String getMovieLanguage() {
		return movieLanguage;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @return the duration
	 */
	public short getDuration() {
		return duration;
	}

	/**
	 * @return the trailerLink
	 */
	public String getTrailerLink() {
		return trailerLink;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the overalRating
	 */
	public short getOveralRating() {
		return overalRating;
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
	 * @param movieLanguage
	 *            the movieLanguage to set
	 */
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	/**
	 * @param releaseDate
	 *            the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(short duration) {
		this.duration = duration;
	}

	/**
	 * @param trailerLink
	 *            the trailerLink to set
	 */
	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param overalRating
	 *            the overalRating to set
	 */
	public void setOveralRating(short overalRating) {
		this.overalRating = overalRating;
	}
	
	@Override
	public String toString() {
		return movieId + " " + movieTitle + " " + movieLanguage + " " + releaseDate + " " 
				+ duration + " " + trailerLink + " " + description;
	}

}
