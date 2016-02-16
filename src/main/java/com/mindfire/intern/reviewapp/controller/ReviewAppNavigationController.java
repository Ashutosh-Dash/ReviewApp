package com.mindfire.intern.reviewapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.MovieDTO;
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;

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
		List<String> questionList = new ArrayList<>();
		questionList.add("What is your favourite sport?");
		questionList.add("What is the name of your first pet?");
		questionList.add("What is the name of the town you were born?");
		questionList.add("Who is your favourite person?");
		questionList.add("What is the name of your first school?");
		questionList.add("What is your father's first name?");
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("userDetailDto", new UserDetailDTO());
		model.addAttribute("questionList", questionList);
		return "registration";

	}
	
	@RequestMapping(value = "addnewmovie", method = RequestMethod.GET)
	public String addNewMovie(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("movieDto", new MovieDTO());
		return "addnewmovie";
		
	}
	
	@RequestMapping(value = "addproductiondetail", method = RequestMethod.GET)
	public String addProductionDetail(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("movieProductionDto", new MovieProductionDTO());
		return "addproductiondetail";
		
	}

	@RequestMapping(value = "aboutus", method = RequestMethod.GET)
	public String aboutus(ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "aboutus";
	}
	
}
