/*
 * @ReviewAppFormsController.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mindfire.intern.reviewapp.dto.LoggedInUserInfo;
import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.MovieDTO;
import com.mindfire.intern.reviewapp.dto.MovieGalleryAsPath;
import com.mindfire.intern.reviewapp.dto.MovieGalleryDTO;
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;
import com.mindfire.intern.reviewapp.dto.MovieResult;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;
import com.mindfire.intern.reviewapp.service.MovieGalleryService;
import com.mindfire.intern.reviewapp.service.MovieProductionService;
import com.mindfire.intern.reviewapp.service.MovieService;
import com.mindfire.intern.reviewapp.service.UserDetailService;

/**
 * The class ReviewAppFormsController implements methods to receive and navigate
 * the data received from different form controls in the user interface of the
 * application
 * 
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Controller
@RequestMapping("/")
public class ReviewAppFormsController {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private UserDetailService userDetailService;

	@Autowired
	private MovieService movieService;

	@Autowired
	private MovieProductionService movieProductionService;

	@Autowired
	private MovieGalleryService movieGalleryService;

	/**
	 * This method converts the incoming data of date format and binds it to an
	 * object of Date class
	 * 
	 * @see Date
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	/**
	 * This method handles the input data from the registration page
	 * 
	 * @param userDetailDto
	 *            Maps the incoming data to an object of UserDetailDTO class
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session from request
	 * @return Returns the registrationsuccess page in case of susseccful
	 *         registration to the application
	 */
	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String afterRegistration(@ModelAttribute("userDetailDto") UserDetailDTO userDetailDto, ModelMap model,
			HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		userDetailService.createUserDetail(userDetailDto);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.REGISTRATION_SUCCESS_PAGE;

	}

	/**
	 * This method handles the input data from the search box
	 * 
	 * @param search
	 *            Maps the input data to an object of Search class
	 * @param model
	 *            Receives the model of request
	 * @param session
	 *            Receives the session from request
	 * @return Returns the movielist page with search results
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String search(@ModelAttribute("search") Search search, ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		List<MovieResult> movieResults = movieService.findResultByMovieTitle(search.getSearchItem());
		model.addAttribute("results", movieResults);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.MOVIE_LIST_PAGE;

	}

	/**
	 * This method handles the input from the login form In case of successful
	 * login it creates a session with the required user information else it
	 * redirects to invlid login page
	 * 
	 * @param loginInfo
	 *            Maps the input data to an object of LoginInfo class
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("logininfo") LoginInfo loginInfo, ModelMap model) {
		boolean valid = userDetailService.matchUserData(loginInfo);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		if (valid) {
			HttpSession session = request.getSession();
			LoggedInUserInfo userInfo = userDetailService.getUserNameIdRole(loginInfo.getUserName());
			session.setAttribute("userInfo", userInfo);
			return ReviewAppConstants.INDEX_PAGE;
		} else {
			return ReviewAppConstants.INVALID_LOGIN_PAGE;
		}

	}

	/**
	 * This method handles the incoming data from the add new movie form
	 * 
	 * @param movieDto
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "addnewmovie", method = RequestMethod.POST)
	public String addedNewMovie(@ModelAttribute("movieDto") MovieDTO movieDto, ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		movieService.createMovie(movieDto);
		model.addAttribute("movieProductionDto", new MovieProductionDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "redirect:" + ReviewAppConstants.ADD_PRODUCTION_DETAIL_PAGE;

	}

	/**
	 * This method handles the incoming data from the production detail form
	 * Adds new production details data for the last added movie if it doesn't
	 * exist already
	 * 
	 * @param movieProdDto
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "addproductiondetail", method = RequestMethod.POST)
	public String addedProductionDetail(@ModelAttribute("movieProductionDto") MovieProductionDTO movieProdDto,
			ModelMap model, HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));
		movieProductionService.createMovieProduction(movieProdDto);
		model.addAttribute("movieGalleryDto", new MovieGalleryDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "redirect:" + ReviewAppConstants.ADD_GALLERY_PAGE;

	}

	/**
	 * This method handles the incoming data from the add gallery form
	 * Adds new a new picture gallery for the last added movie if it doesn't
	 * exist already
	 * The incoming pictures are stored in a specific location and the absolute
	 * path to that location is forwarded to the database
	 * @param movieGalleryDto
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "addgallery", method = RequestMethod.POST)
	public String addedGallery(@ModelAttribute("movieGalleryDto") MovieGalleryDTO movieGalleryDto, ModelMap model,
			HttpSession session) {
		session.setAttribute("userInfo", (LoggedInUserInfo) session.getAttribute("userInfo"));

		String path;
		MovieGalleryAsPath movieGalleryPath = new MovieGalleryAsPath();
		long mid = movieGalleryDto.getMovieId();

		movieGalleryPath.setMovieId(mid);

		path = saveImageAndReturnPath(movieGalleryDto.getSearchResultImage(), mid);
		movieGalleryPath.setSearchResultImage(path);

		path = saveImageAndReturnPath(movieGalleryDto.getCarouselImage1(), mid);
		movieGalleryPath.setCarouselImage1(path);

		path = saveImageAndReturnPath(movieGalleryDto.getCarouselImage2(), mid);
		movieGalleryPath.setCarouselImage2(path);

		path = saveImageAndReturnPath(movieGalleryDto.getCarouselImage3(), mid);
		movieGalleryPath.setCarouselImage3(path);

		path = saveImageAndReturnPath(movieGalleryDto.getCarouselImage4(), mid);
		movieGalleryPath.setCarouselImage4(path);

		path = saveImageAndReturnPath(movieGalleryDto.getCarouselImage5(), mid);
		movieGalleryPath.setCarouselImage5(path);

		movieGalleryService.createMovieGallery(movieGalleryPath);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return ReviewAppConstants.INDEX_PAGE;

	}

	/**
	 * This method take a multipart file and the movie id as input and creates a folder
	 * with the id as folder name and stores the file in that folder
	 * @param file A multipart file
	 * @param movieId the movie id for which the gallery is to be created
	 * @return Returns the absolute path of the stored file
	 */
	public String saveImageAndReturnPath(MultipartFile file, long movieId) {

		String imagesDir = "/images/" + movieId + "/";
		String realPathToImages = request.getServletContext().getRealPath(imagesDir);
		String fileName;
		String pathOfImageFile;
		System.out.println(realPathToImages);
		if (!new File(realPathToImages).exists()) {
			new File(realPathToImages).mkdir();
		}

		fileName = file.getOriginalFilename();
		pathOfImageFile = realPathToImages + fileName;
		File dest = new File(pathOfImageFile);

		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dest.getAbsolutePath();
	}

}
