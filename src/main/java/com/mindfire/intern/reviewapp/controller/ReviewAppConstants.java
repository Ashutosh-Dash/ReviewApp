/*
 * @ReviewAppConstants.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.controller;

import java.util.Arrays;
import java.util.List;

/**
 * The ReviewAppConstants class contains some string constants which are
 * used frequently in the application
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
public class ReviewAppConstants {
	
	public static final String INDEX_PAGE = new String("index");
	public static final String ABOUT_US_PAGE = new String("aboutus");
	public static final String ADD_GALLERY_PAGE = new String("addgallery");
	public static final String ADD_NEW_MOVIE_PAGE = new String("addnewmovie");
	public static final String ADD_PRODUCTION_DETAIL_PAGE = new String("addproductiondetail");
	public static final String INVALID_LOGIN_PAGE = new String("invalidLogin");
	public static final String MOVIE_DETAIL_PAGE = new String("moviedetail");
	public static final String MOVIE_LIST_PAGE = new String("movielist");
	public static final String REGISTRATION_PAGE = new String("registration");
	public static final String REGISTRATION_SUCCESS_PAGE = new String("registrationsuccess");
	
	public static final String BASE_PATH = new String(
			"/home/mindfire/Documents/workspaceSTS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ReviewApp");
	
	public static final List<String> QUESTION_LIST = Arrays.asList(
			"What is your favourite sport?", 
			"What is the name of your first pet?", 
			"What is the name of the town you were born?", 
			"Who is your favourite person?", 
			"What is the name of your first school?", 
			"What is your father's first name?");

}
