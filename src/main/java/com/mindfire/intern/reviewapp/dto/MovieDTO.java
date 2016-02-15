/**
 * 
 */
package com.mindfire.intern.reviewapp.dto;

import java.util.Date;

/**
 * @author Ashutosh Dash
 *
 */
public class MovieDTO {

	private String movieTitle;
	private String movieLanguage;
	private Date releaseDate;
	private short duration;
	private String trailerLink;
	private String description;
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
	 * @param movieTitle the movieTitle to set
	 */
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	/**
	 * @param movieLanguage the movieLanguage to set
	 */
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(short duration) {
		this.duration = duration;
	}
	/**
	 * @param trailerLink the trailerLink to set
	 */
	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
