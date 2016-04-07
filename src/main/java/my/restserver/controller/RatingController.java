package my.restserver.controller;

import java.util.Date;
import java.util.List;

import my.restserver.entity.Rating;
import my.restserver.service.RatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages={"my.restserver.service"})
public class RatingController {
	@Autowired
	private RatingService ratingService;
	
	@RequestMapping(value="/task0ratings")
	public ModelAndView getAllRatings(){
		ModelAndView modelAndView = new ModelAndView("showRatings");
		modelAndView.addObject("ratings", ratingService.getAll());
		return modelAndView;
	}
	
	@RequestMapping(value="/task1")
	public ModelAndView getAllRatingsWithNullData(){
		List<Rating> nullRatings = ratingService.getRatingsWithNullDate();
		for(int i = 0; i < nullRatings.size(); i++ )
		{
			nullRatings.get(i).setRatingDate(new Date());
			ratingService.addRating(nullRatings.get(i));
	}
		ModelAndView modelAndView = new ModelAndView("showRatings");
		modelAndView.addObject("ratings", ratingService.getAll());
		return modelAndView;
	}
	
	@RequestMapping(value="/task3")
	public ModelAndView getSortedRatingByDate(){
		
		ModelAndView modelAndView = new ModelAndView("showRatings");
		modelAndView.addObject("ratings", ratingService.findByRatingOrRatingOrderByRatingDateAsc(4,5));
		return modelAndView;
	}
	
	@RequestMapping(value = "/task4")
	public ModelAndView getTitlesWhereNoRatings() {
		List<String> listOfTitles = ratingService.getTitlesWithNoRatings();
		ModelAndView modelAndView = new ModelAndView("titlesOfMovies");
		modelAndView.addObject("titles",listOfTitles);
		return modelAndView;
	}
	
	@RequestMapping(value = "/task6")
	public ModelAndView getDataForEveryRating() {
		ModelAndView modelAndView = new ModelAndView("specificDataForEveryRating");
		modelAndView.addObject("ratings", ratingService.getAll());
		return modelAndView;
	}
}
