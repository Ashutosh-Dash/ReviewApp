/*
 * @UserDetailService.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.UserDetailComponent;
import com.mindfire.intern.reviewapp.domain.UserDetail;
import com.mindfire.intern.reviewapp.dto.LoggedInUserInfo;
import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;

/**
 * The UserDetailService class contains methods for interaction between 
 * controller classes and UserDetailComponent class
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Service
public class UserDetailService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	@Autowired
	private UserDetailComponent userDetailComponent;
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve user details from its user name
	 * @param userName A String
	 * @return Returns a UserDetail object
	 */
	public UserDetail findByUserName(String userName) {
		return userDetailComponent.getUserDetail(userName);
	}
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve user details from its user e-mail Id
	 * @param userName A String
	 * @return Returns a UserDetail object
	 */
	public UserDetail findByEmailId(String emailId) {
		return  userDetailComponent.getUserByEmailId(emailId);
	}
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve user details from its user id
	 * @param userId A long value
	 * @return Returns a UserDetail object
	 */
	public UserDetail findByUserId(long userId) {
		return userDetailComponent.getUserDetailById(userId);
	}
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve user id, name and role from user name
	 * @param userName A String
	 * @return Returns a LoggedInUserInfo object
	 */
	public LoggedInUserInfo getUserNameIdRole(String userName) {
		LoggedInUserInfo userInfo = new LoggedInUserInfo();
		UserDetail userDetail = this.findByUserName(userName);
		userInfo.setUserId(userDetail.getUserId());
		userInfo.setUserName(userDetail.getUserName());
		userInfo.setRole(userDetail.getUserRole());
		return userInfo;
	}
	
	/**
	 * This method calls the corresponding component class method to
	 * retrieve user details from its user name to authenticate an user
	 * for the login process
	 * @param loginInfo A LoginInfo object
	 * @return True if user name and corresponding password matches successfully
	 */
	public boolean matchUserData(LoginInfo loginInfo) {
		UserDetail userDetail = this.findByUserName(loginInfo.getUserName());
		if(userDetail != null) {
			if(encoder.matches(loginInfo.getPassword(), userDetail.getPassword())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method calls the corresponding component class method to store
	 * the user details in the database
	 * @param userDetailDto A UserDetailDTO object
	 * @return Returns the created user details as UserDetail object
	 */
	public UserDetail createUserDetail(UserDetailDTO userDetailDto) {
		
		UserDetail userDetail = new UserDetail();
		userDetail.setUserName(userDetailDto.getUserName());
		userDetail.setFirstName(userDetailDto.getFirstName());
		userDetail.setLastName(userDetailDto.getLastName());
		userDetail.setEmailId(userDetailDto.getEmailId());
		userDetail.setPassword(new BCryptPasswordEncoder().encode(userDetailDto.getPassword()));
		userDetail.setSecretQuestion(userDetailDto.getSecretQuestion());
		userDetail.setSecretAnswer(userDetailDto.getSecretAnswer());
		userDetail.setUserRole("user");
		
		UserDetail createdUserDetail = userDetailComponent.saveUserDetail(userDetail);
		logger.info("User with username " + userDetailDto.getUserName()
				+ " sucessfully created");
		
		return createdUserDetail;
	}

}
