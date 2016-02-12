package com.mindfire.intern.reviewapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.intern.reviewapp.model.LoginInfo;
import com.mindfire.intern.reviewapp.model.Search;
import com.mindfire.intern.reviewapp.model.UserInformationModel;

@Controller
@RequestMapping("/")
public class ReviewAppNavigationController {

	@RequestMapping(method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "index";

	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexPage(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "index";

	}

	@RequestMapping(value = "movielist", method = RequestMethod.GET)
	public String movielist(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "movielist";

	}

	@RequestMapping(value = "moviedetail", method = RequestMethod.GET)
	public String moviedetail(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "moviedetail";

	}

	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String beforeRegistration(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("userInformationModel", new UserInformationModel());
		return "registration";

	}

	@RequestMapping(value = "aboutus", method = RequestMethod.GET)
	public String aboutus(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "aboutus";
	}
}
