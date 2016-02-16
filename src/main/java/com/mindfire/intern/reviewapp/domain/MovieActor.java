/*
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 * @author Ashutosh Dash
 *
 */
@Entity
@Table(name = "movie_actor")
@NamedNativeQuery(name = "MovieActor.findAll", query = "SELECT ma from MovieActor ma")
public class MovieActor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actor_id")
	private long actorId;

	@ManyToOne
	@JoinColumn(name = "m_id", referencedColumnName = "movie_id")
	private Movie movie;

	@Column(name = "actor_name")
	private String actorName;

	/**
	 * @return the actorId
	 */
	public long getActorId() {
		return actorId;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @return the actorName
	 */
	public String getActorName() {
		return actorName;
	}

	/**
	 * @param actorId
	 *            the actorId to set
	 */
	public void setActorId(long actorId) {
		this.actorId = actorId;
	}

	/**
	 * @param movie
	 *            the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * @param actorName
	 *            the actorName to set
	 */
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

}
