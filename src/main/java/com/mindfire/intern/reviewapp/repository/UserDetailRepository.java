/**
 * 
 */
package com.mindfire.intern.reviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.UserDetail;

/**
 * @author Ashutosh Dash
 *
 */
@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {
	
	UserDetail findByUserName(String userName);

}
