/**
 * 
 */
package com.mindfire.intern.reviewapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.intern.reviewapp.model.LoginInfo;
import com.mindfire.intern.reviewapp.model.Search;
import com.mindfire.intern.reviewapp.model.UserInformationModel;

/**
 * @author mindfire
 *
 */
@Controller
@RequestMapping("/")
public class ReviewAppFormsController {

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String afterRegistration(@ModelAttribute("userInformationModel") UserInformationModel userInformation) {
		return "registrationsuccess";

	}
	
	@RequestMapping(value = "search" , method = RequestMethod.POST)
	public String search(@ModelAttribute("search") Search search) {
		return "redirect:movielist";
		
	}
	
	@RequestMapping(value = "login" , method = RequestMethod.POST)
	public String login(@ModelAttribute("logininfo") LoginInfo loginInfo) {
		return "redirect:index";
		
	}

}
