/**
 * 
 */
package com.mindfire.intern.reviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.Movie;

/**
 * @author Ashutosh Dash
 *
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	Movie findByMovieTitle(String movieTitle);

}
