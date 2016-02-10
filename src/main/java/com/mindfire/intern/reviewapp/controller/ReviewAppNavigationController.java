package com.mindfire.intern.reviewapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ReviewAppNavigationController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "index";
		
	}
	
	@RequestMapping(value = "index" ,method = RequestMethod.GET)
	public String indexPage(ModelMap model) {
		return "index";
		
	}
	
	@RequestMapping(value = "movielist" ,method = RequestMethod.GET)
	public String movielist(ModelMap model) {
		return "movielist";
		
	}
	
	@RequestMapping(value = "moviedetail" ,method = RequestMethod.GET)
	public String moviedetail(ModelMap model) {
		return "moviedetail";
		
	}
	
	@RequestMapping(value = "registration" ,method = RequestMethod.GET)
	public String registration(ModelMap model) {
		return "registration";
		
	}
	
	@RequestMapping(value = "aboutus", method = RequestMethod.GET)
	public String aboutus(ModelMap model) {
		return "aboutus";
	}
}
