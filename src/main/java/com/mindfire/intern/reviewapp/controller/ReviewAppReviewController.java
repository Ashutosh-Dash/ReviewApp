/*
 * @ReviewAppReviewController.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.domain.MovieProduction;
import com.mindfire.intern.reviewapp.dto.LoggedInUserInfo;
import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.MovieGalleryAsPath;
import com.mindfire.intern.reviewapp.dto.ReviewDTO;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.service.MovieGalleryService;
import com.mindfire.intern.reviewapp.service.MovieProductionService;
import com.mindfire.intern.reviewapp.service.MovieService;

/**
 * The ReviewAppReviewController class handles the navigation from the movie
 * detail page to the review submission
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Controller
@RequestMapping("/")
@SessionAttributes({ "movie" })
public class ReviewAppReviewController {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieProductionService movieProductionService;

	@Autowired
	private MovieGalleryService galleryService;

	/**
	 * This method returns the moviedetail page
	 * 
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session object from request
	 * @return Returns the initial view
	 */
	@RequestMapping(value = "moviedetail/{movieId}", method = RequestMethod.GET)
	public String movieDetail(@PathVariable("movieId") long movieId, ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		Movie movie = movieService.findByMovieId(movieId);
		MovieProduction movieProduction = movieProductionService.findByMovie(movie);
		MovieGalleryAsPath movieGalleryAsPath = galleryService.findRelativePathByMovie(movie);
		model.addAttribute("movie", movie);
		model.addAttribute("movieProduction", movieProduction);
		model.addAttribute("movieGalleryAsPath", movieGalleryAsPath);
		model.addAttribute("reviewDto", new ReviewDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.MOVIE_DETAIL_PAGE;

	}

	/**
	 * This method handles the incoming data from the review submission form
	 * @param reviewDto
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "submitReview", method = RequestMethod.POST)
	public String reviewAdded(@ModelAttribute("reviewDto") ReviewDTO reviewDto, ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.MOVIE_DETAIL_PAGE;
	}

}
