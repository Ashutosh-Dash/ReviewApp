/**
 * 
 */
package com.mindfire.intern.reviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.MovieProduction;

/**
 * @author Ashutosh Dash
 *
 */
@Repository
public interface MovieProductionRepository extends JpaRepository<MovieProduction, Integer> {

	MovieProduction findByMovie(long movie);
	
}
