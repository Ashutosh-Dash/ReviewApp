/**
 * 
 */
package com.mindfire.intern.reviewapp.controller;

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
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;
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
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
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
		Movie movie = movieService.getLastMovie(movieDto.getMovieTitle());
		model.addAttribute("Id", movie.getMovieId());
		model.addAttribute("movieProductionDto", new MovieProductionDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "addproductiondetail";
		
	}
	
	@RequestMapping(value = "addproductiondetail", method = RequestMethod.POST)
	public String addedProductionDetail(
			@ModelAttribute("movieProductionDto") MovieProductionDTO movieProdDto,
			ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "addgallery";
		
	}

}
