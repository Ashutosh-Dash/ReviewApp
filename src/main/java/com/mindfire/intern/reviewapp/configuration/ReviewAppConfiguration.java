/*
 * @ReviewAppConfiguration.java 1.0_02192016
 * Copyright (c) 1999-2016 MindfireSolutions
 */
package com.mindfire.intern.reviewapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * The ReviewAppConfiguration class implements bean configurations for the ReviewApp project
 * This class enables the Spring web MVC configurations
 * @version 1.0_02192016
 * @author Ashutosh Dash
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mindfire.intern.reviewapp")
public class ReviewAppConfiguration extends WebMvcConfigurerAdapter {
	
	/**
	 * This method acts a web mvc bean to handle the output view of the application
	 * @see ViewResolver
	 * @return Returns a ViewResolver object
	 */
	@Bean(name = "ReviewApp")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	/**
	 * This method acts as a bean to handle multipart files
	 * The uploaded multipart files are converted to objects of MutipartFile class
	 * @see MultipartFile
	 * @return Returns a CommonsMultipartResolver object
	 */
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver createMultipartResolver() {
	    CommonsMultipartResolver resolver=new CommonsMultipartResolver();
	    resolver.setDefaultEncoding("utf-8");
	    return resolver;
	}
	
	/**
	 * This method acts as a bean to handle spring mvc resources
	 * The resurecs requests are mapped accordingly
	 */
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
	}

}
