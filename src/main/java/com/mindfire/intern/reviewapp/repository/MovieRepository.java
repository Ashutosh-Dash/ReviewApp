/**
 * 
 */
package com.mindfire.intern.reviewapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.Movie;

/**
 * @author Ashutosh Dash
 *
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByMovieTitleContainingIgnoreCase(String movieTitle);
	Movie findFirstByMovieTitleOrderByMovieIdDesc(String movieTitle);

}
