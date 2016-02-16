/**
 * 
 */
package com.mindfire.intern.reviewapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Ashutosh Dash
 *
 */
@Entity
@Table(name = "movie_production")
@NamedNativeQuery(name = "MovieProduction.findAll", query = "SELECI mp from MovieProduction mp")
public class MovieProduction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "production_id")
	private long productionId;

	@OneToOne
	@JoinColumn(name = "m_id", referencedColumnName = "movie_id", unique = true)
	private Movie movie;

	@Column
	private String director;

	@Column
	private String producer;

	@Column
	private String studio;

	@Column(name = "production_budget")
	private long productionBudget;

	/**
	 * @return the productionId
	 */
	public long getProductionId() {
		return productionId;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
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
	 * @return the productionBudget
	 */
	public long getProductionBudget() {
		return productionBudget;
	}

	/**
	 * @param productionId
	 *            the productionId to set
	 */
	public void setProductionId(long productionId) {
		this.productionId = productionId;
	}

	/**
	 * @param movie
	 *            the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
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
	 * @param productionBudget
	 *            the productionBudget to set
	 */
	public void setProductionBudget(long productionBudget) {
		this.productionBudget = productionBudget;
	}

}
