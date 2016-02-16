/**
 * 
 */
package com.mindfire.intern.reviewapp.domain;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "user_review")
@NamedNativeQuery(name = "UserReview.findAll", query = "SELECT ur from UserReview ur")
public class UserReview implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id")
	private long reviewId;

	@ManyToOne
	@JoinColumn(name = "u_id", referencedColumnName = "user_id")
	private UserDetail userDetail;

	@ManyToOne
	@JoinColumn(name = "m_id", referencedColumnName = "movie_id")
	private Movie movie;

	@Column(name = "user_review", columnDefinition = "TEXT")
	private String review;

	@Column(name = "user_rating", nullable = false)
	private short rating;

	@Column(name = "added_on", columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP ")
	private Date addedOn;

	/**
	 * @return the reviewId
	 */
	public long getReviewId() {
		return reviewId;
	}

	/**
	 * @return the userDetail
	 */
	public UserDetail getUserDetail() {
		return userDetail;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @return the rating
	 */
	public short getRating() {
		return rating;
	}

	/**
	 * @return the addedOn
	 */
	public Date getAddedOn() {
		return addedOn;
	}

	/**
	 * @param reviewId
	 *            the reviewId to set
	 */
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @param userDetail
	 *            the userDetail to set
	 */
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	/**
	 * @param movie
	 *            the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * @param review
	 *            the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(short rating) {
		this.rating = rating;
	}

	/**
	 * @param addedOn
	 *            the addedOn to set
	 */
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

}
