package my.restserver.controller;

import my.restserver.entity.Movie;
import my.restserver.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages = { "my.restserver.service" })
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping(value = "/task0movies")
	public ModelAndView getAllMovies() {
		ModelAndView modelAndView = new ModelAndView("showMovies");
		modelAndView.addObject("movies", movieService.getAll());
		return modelAndView;
	}

	@RequestMapping(value = "/task2")
	public ModelAndView insertMovies() {
		Movie movie = new Movie();
		movie.setMovieId(9);
		movie.setTitle("Deadpool");
		movie.setDirector("Tim Miller");
		
		movieService.addMovie(movie);

		movie.setMovieId(10);
		movie.setTitle("The 300 spartans");
		movie.setDirector("Zak Snyder");

		movieService.addMovie(movie);
		ModelAndView modelAndView = new ModelAndView("showMovies");
		modelAndView.addObject("movies", movieService.getAll());
		return modelAndView;
	}
	
	@RequestMapping(value = "/task5")
	public ModelAndView deleteMovies() {
		
		Movie movie = movieService.findOne(9);
		
		if(movie != null) {
		movieService.delete(9);
		movieService.delete(10);
		}
		
		ModelAndView modelAndView = new ModelAndView("showMovies");
		modelAndView.addObject("movies", movieService.getAll());
		return modelAndView;
	}
}
