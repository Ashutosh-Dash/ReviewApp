/*
 * @UserDetailRepository.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.intern.reviewapp.domain.UserDetail;

/**
 * The UserDetailRepository interface is the repository for the
 * user_detail table to be used for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {
	
	UserDetail findByUserName(String userName);
	UserDetail findByUserId(long userId);

}
