/**
 * 
 */
package com.mindfire.intern.reviewapp.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.MovieDTO;
import com.mindfire.intern.reviewapp.dto.MovieGalleryDTO;
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;
import com.mindfire.intern.reviewapp.service.MovieProductionService;
import com.mindfire.intern.reviewapp.service.MovieService;
import com.mindfire.intern.reviewapp.service.UserDetailService;

/**
 * @author mindfire
 *
 */
@Controller
@RequestMapping("/")
public class ReviewAppFormsController {
	
	@Autowired
	private UserDetailService userDetailService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieProductionService movieProductionService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String afterRegistration(@ModelAttribute("userDetailDto") UserDetailDTO userDetailDto,
			ModelMap model) {
		userDetailService.createUserDetail(userDetailDto);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "registrationsuccess";

	}
	
	@RequestMapping(value = "search" , method = RequestMethod.POST)
	public String search(@ModelAttribute("search") Search search, ModelMap model) {
		List<Movie> movie = movieService.findByMovieTitle(search.getSearchItem());
		System.out.println(movie);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "movielist";
		
	}
	
	@RequestMapping(value = "login" , method = RequestMethod.POST)
	public String login(@ModelAttribute("logininfo") LoginInfo loginInfo, ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "index";
		
	}
	
	@RequestMapping(value = "addnewmovie", method = RequestMethod.POST)
	public String addedNewMovie(@ModelAttribute("movieDto") MovieDTO movieDto,
			ModelMap model) {
		movieService.createMovie(movieDto);
		model.addAttribute("movieProductionDto", new MovieProductionDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "redirect:addproductiondetail";
		
	}
	
	@RequestMapping(value = "addproductiondetail", method = RequestMethod.POST)
	public String addedProductionDetail(
			@ModelAttribute("movieProductionDto") MovieProductionDTO movieProdDto,
			ModelMap model) {
		movieProductionService.createMovieProduction(movieProdDto);
		model.addAttribute("movieGalleryDto", new MovieGalleryDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "redirect:addgallery";
		
	}
	
	@RequestMapping(value = "addgallery", method = RequestMethod.POST)
	public String addedGallery(@ModelAttribute("movieGalleryDto") MovieGalleryDTO movieGalleryDto, 
			ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "aboutus";
		
	}

}
