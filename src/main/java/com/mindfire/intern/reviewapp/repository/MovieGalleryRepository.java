/**
 * 
 */
package com.mindfire.intern.reviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieGallery;

/**
 * @author Ashutosh Dash
 *
 */
@Repository
public interface MovieGalleryRepository extends JpaRepository<MovieGallery, Integer> {
	
	MovieGallery findByMovie(Movie movie);

}
