package com.mindfire.intern.reviewapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.intern.reviewapp.component.UserDetailComponent;
import com.mindfire.intern.reviewapp.domain.UserDetail;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;

@Service
public class UserDetailService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserDetailComponent userDetailComponent;
	
	public UserDetail findByUserName(String userName) {
		return userDetailComponent.getUserDetail(userName);
	}
	
	public UserDetail createUserDetail(UserDetailDTO userDetailDto) {
		
		UserDetail userDetail = new UserDetail();
		userDetail.setUserName(userDetailDto.getUserName());
		userDetail.setFirstName(userDetailDto.getFirstName());
		userDetail.setLastName(userDetailDto.getLastName());
		userDetail.setEmailId(userDetailDto.getEmailId());
		userDetail.setPassword(userDetailDto.getPassword());
		userDetail.setSecretQuestion(userDetailDto.getSecretQuestion());
		userDetail.setSecretAnswer(userDetailDto.getSecretAnswer());
		
		UserDetail createdUserDetail = userDetailComponent.saveUserDetail(userDetail);
		logger.info("User with username " + userDetailDto.getUserName()
				+ " sucessfully created");
		
		return createdUserDetail;
	}

}
