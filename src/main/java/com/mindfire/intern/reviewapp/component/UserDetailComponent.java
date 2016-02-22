/*
 * @UserDetailComponent.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.UserDetail;
import com.mindfire.intern.reviewapp.repository.UserDetailRepository;

/**The UserDetailComponent class contains methods to interact with the corresponding
 * repository for CRUD operations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Component
public class UserDetailComponent {

	@Autowired
	private UserDetailRepository userDetailRepository;
	
	/**
	 * This method uses repository method to retrieve a details of a user
	 * corresponding to the user name
	 * @param userName A String
	 * @return Returns a UserDetail object
	 */
	@Transactional
	public UserDetail getUserDetail(String userName) {
		return userDetailRepository.findByUserName(userName);
	}
	
	/**
	 * This method uses repository method to retrieve a details of a user
	 * corresponding to the user id
	 * @param userId A long value
	 * @return Returns a UserDetail object
	 */
	@Transactional
	public UserDetail getUserDetailById(long userId) {
		return userDetailRepository.findByUserId(userId);
	}
	
	/**
	 * This method uses repository method to store the details of an user
	 * @param userDetail a UserDetail object
	 * @return Returns a UserDetail object
	 */
	@Transactional
	public UserDetail saveUserDetail(UserDetail userDetail) {
		return userDetailRepository.save(userDetail);
	}
	
}
