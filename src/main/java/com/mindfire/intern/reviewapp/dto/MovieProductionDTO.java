/**
 * 
 */
package com.mindfire.intern.reviewapp.dto;

/**
 * @author Ashutosh Dash
 *
 */
public class MovieProductionDTO {

	private long movieId;
	private String director;
	private String producer;
	private String studio;
	private long budget;

	/**
	 * @return the movieId
	 */
	public long getMovieId() {
		return movieId;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * @return the studio
	 */
	public String getStudio() {
		return studio;
	}

	/**
	 * @return the budget
	 */
	public long getBudget() {
		return budget;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	/**
	 * @param director
	 *            the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @param producer
	 *            the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * @param studio
	 *            the studio to set
	 */
	public void setStudio(String studio) {
		this.studio = studio;
	}

	/**
	 * @param budget
	 *            the budget to set
	 */
	public void setBudget(long budget) {
		this.budget = budget;
	}

}
