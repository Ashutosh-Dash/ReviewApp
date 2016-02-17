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
@Table(name = "movie_images_gallery")
@NamedNativeQuery(name = "MovieGallery.findAll", query = "SELECT mg from MovieGallery mg")
public class MovieGallery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gallery_Id")
	private long galleryId;

	@OneToOne
	@JoinColumn(name = "m_id", referencedColumnName = "movie_id", unique = true)
	private Movie movie;

	@Column(name = "search_result_image")
	private String searchResultImage;

	@Column(name = "carousel_image_1")
	private String carouselImage1;

	@Column(name = "carousel_image_2")
	private String carouselImage2;

	@Column(name = "carousel_image_3")
	private String carouselImage3;

	@Column(name = "carousel_image_4")
	private String carouselImage4;

	@Column(name = "carousel_image_5")
	private String carouselImage5;

	/**
	 * @return the galleryId
	 */
	public long getGalleryId() {
		return galleryId;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @return the searchResultImage
	 */
	public String getSearchResultImage() {
		return searchResultImage;
	}

	/**
	 * @return the carouselImage1
	 */
	public String getCarouselImage1() {
		return carouselImage1;
	}

	/**
	 * @return the carouselImage2
	 */
	public String getCarouselImage2() {
		return carouselImage2;
	}

	/**
	 * @return the carouselImage3
	 */
	public String getCarouselImage3() {
		return carouselImage3;
	}

	/**
	 * @return the carouselImage4
	 */
	public String getCarouselImage4() {
		return carouselImage4;
	}

	/**
	 * @return the carouselImage5
	 */
	public String getCarouselImage5() {
		return carouselImage5;
	}

	/**
	 * @param galleryId
	 *            the galleryId to set
	 */
	public void setGalleryId(long galleryId) {
		this.galleryId = galleryId;
	}

	/**
	 * @param movie
	 *            the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * @param searchResultImage
	 *            the searchResultImage to set
	 */
	public void setSearchResultImage(String searchResultImage) {
		this.searchResultImage = searchResultImage;
	}

	/**
	 * @param carouselImage1
	 *            the carouselImage1 to set
	 */
	public void setCarouselImage1(String carouselImage1) {
		this.carouselImage1 = carouselImage1;
	}

	/**
	 * @param carouselImage2
	 *            the carouselImage2 to set
	 */
	public void setCarouselImage2(String carouselImage2) {
		this.carouselImage2 = carouselImage2;
	}

	/**
	 * @param carouselImage3
	 *            the carouselImage3 to set
	 */
	public void setCarouselImage3(String carouselImage3) {
		this.carouselImage3 = carouselImage3;
	}

	/**
	 * @param carouselImage4
	 *            the carouselImage4 to set
	 */
	public void setCarouselImage4(String carouselImage4) {
		this.carouselImage4 = carouselImage4;
	}

	/**
	 * @param carouselImage5
	 *            the carouselImage5 to set
	 */
	public void setCarouselImage5(String carouselImage5) {
		this.carouselImage5 = carouselImage5;
	}

}
