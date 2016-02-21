/*
 * @ReviewAppNavigationController.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.dto.LoggedInUserInfo;
import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.MovieDTO;
import com.mindfire.intern.reviewapp.dto.MovieGalleryDTO;
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;
import com.mindfire.intern.reviewapp.dto.MovieResult;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;
import com.mindfire.intern.reviewapp.service.MovieService;

/**
 * The ReviewAppNavigationController class is a controller class for general
 * navigation through the application user interface
 * 
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Controller
@RequestMapping("/")
public class ReviewAppNavigationController {

	@Autowired
	private MovieService movieService;

	/**
	 * This method returns the initial view of the application
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the initial view
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String homePage(ModelMap model, HttpSession session) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.INDEX_PAGE;

	}

	/**
	 * This method returns the index page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the index page
	 */
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexPage(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.INDEX_PAGE;

	}

	/**
	 * This method returns the movielist page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the movielist page
	 */
	@RequestMapping(value = "movielist", method = RequestMethod.GET)
	public String movieList(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		List<MovieResult> movieResults = movieService.findResultByMovieTitle("");
		model.addAttribute("results", movieResults);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.MOVIE_LIST_PAGE;

	}

	/**
	 * This method returns the movielist page with all hindi movies
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @returnReturns the movielist page
	 */
	@RequestMapping(value = "movielistB", method = RequestMethod.GET)
	public String bollywoodMovieList(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("theMovieList", movieService.findByMovieLanguage("Hindi"));
		return ReviewAppConstants.MOVIE_LIST_PAGE;
	}

	/**
	 * This method returns the movielist page with all English movies
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @returnReturns the movielist page
	 */
	@RequestMapping(value = "movielistH", method = RequestMethod.GET)
	public String hollywoodMovieList(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("theMovieList", movieService.findByMovieLanguage("English"));
		return ReviewAppConstants.MOVIE_LIST_PAGE;
	}

	/**
	 * This method returns the registration page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the registration page
	 */
	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String beforeRegistration(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("userDetailDto", new UserDetailDTO());
		model.addAttribute("questionList", ReviewAppConstants.QUESTION_LIST);
		return ReviewAppConstants.REGISTRATION_PAGE;

	}

	/**
	 * This method returns the addnewmovie page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the addnewmovie page
	 */
	@RequestMapping(value = "addnewmovie", method = RequestMethod.GET)
	public String addNewMovie(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("movieDto", new MovieDTO());
		return ReviewAppConstants.ADD_NEW_MOVIE_PAGE;

	}

	/**
	 * This method returns the addproductiondetail page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the addproductiondetail page
	 */
	@RequestMapping(value = "addproductiondetail", method = RequestMethod.GET)
	public String addProductionDetail(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		Movie movie = movieService.getLastMovie();
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("movieProductionDto", new MovieProductionDTO());
		model.addAttribute("Id", movie.getMovieId());
		return ReviewAppConstants.ADD_PRODUCTION_DETAIL_PAGE;

	}

	/**
	 * This method returns the addgallery page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the addgallery page
	 */
	@RequestMapping(value = "addgallery", method = RequestMethod.GET)
	public String addGallery(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		model.addAttribute("movieGalleryDto", new MovieGalleryDTO());
		model.addAttribute("Id", movieService.getLastMovie().getMovieId());
		return ReviewAppConstants.ADD_GALLERY_PAGE;

	}

	/**
	 * This method returns the aboutus page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the aboutus page
	 */
	@RequestMapping(value = "aboutus", method = RequestMethod.GET)
	public String aboutus(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.ABOUT_US_PAGE;
	}

	/**
	 * This method removes the user from the current session
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the index page
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logut(ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", null);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.INDEX_PAGE;

	}

}
