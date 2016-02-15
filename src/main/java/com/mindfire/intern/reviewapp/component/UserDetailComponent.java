/**
 * 
 */
package com.mindfire.intern.reviewapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mindfire.intern.reviewapp.domain.UserDetail;
import com.mindfire.intern.reviewapp.repository.UserDetailRepository;

/**
 * @author Ashutosh Dash
 *
 */
@Component
public class UserDetailComponent {

	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@Transactional
	public UserDetail getUserDetail(String userName) {
		UserDetail userDetail = userDetailRepository.findByUserName(userName);
		
		return userDetail;
	}
	
	@Transactional
	public UserDetail saveUserDetail(UserDetail userDetail) {
		return userDetailRepository.save(userDetail);
	}
	
}
