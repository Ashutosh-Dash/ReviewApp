/**
 * 
 */
package com.mindfire.intern.reviewapp.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.mindfire.intern.reviewapp.domain.Movie;
import com.mindfire.intern.reviewapp.dto.LoginInfo;
import com.mindfire.intern.reviewapp.dto.MovieDTO;
import com.mindfire.intern.reviewapp.dto.MovieGalleryAsPath;
import com.mindfire.intern.reviewapp.dto.MovieGalleryDTO;
import com.mindfire.intern.reviewapp.dto.MovieProductionDTO;
import com.mindfire.intern.reviewapp.dto.Search;
import com.mindfire.intern.reviewapp.dto.UserDetailDTO;
import com.mindfire.intern.reviewapp.service.MovieGalleryService;
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
	private HttpServletRequest request;

	@Autowired
	private UserDetailService userDetailService;

	@Autowired
	private MovieService movieService;

	@Autowired
	private MovieProductionService movieProductionService;

	@Autowired
	private MovieGalleryService movieGalleryService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String afterRegistration(@ModelAttribute("userDetailDto") UserDetailDTO userDetailDto, ModelMap model) {
		userDetailService.createUserDetail(userDetailDto);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "registrationsuccess";

	}

	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String search(@ModelAttribute("search") Search search, ModelMap model) {
		List<Movie> movie = movieService.findByMovieTitle(search.getSearchItem());
		System.out.println(movie);
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "movielist";

	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("logininfo") LoginInfo loginInfo, ModelMap model) {
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "index";

	}

	@RequestMapping(value = "addnewmovie", method = RequestMethod.POST)
	public String addedNewMovie(@ModelAttribute("movieDto") MovieDTO movieDto, ModelMap model) {
		movieService.createMovie(movieDto);
		model.addAttribute("movieProductionDto", new MovieProductionDTO());
		model.addAttribute("search", new Search());
		model.addAttribute("logininfo", new LoginInfo());
		return "redirect:addproductiondetail";

	}

	@RequestMapping(value = "addproductiondetail", method = RequestMethod.POST)
	public String addedProductionDetail(@ModelAttribute("movieProductionDto") MovieProductionDTO movieProdDto,
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
		return "aboutus";

	}

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
