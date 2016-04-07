package my.restserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import my.restserver.entity.Movie;
import my.restserver.repository.MovieRepository;
import my.restserver.service.MovieService;

@Service
@ComponentScan(basePackages={"my.restserver.repository"})
public class MovieServiceImpl implements MovieService {
	 @Autowired
	private MovieRepository movieRepository;
	 
	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.saveAndFlush(movie);
		}

	@Override
	public void delete(int id) {
		movieRepository.delete(id);
	}

	@Override
	public Movie editMovie(Movie movie) {
		return movieRepository.saveAndFlush(movie);
	}

	@Override
	public List<Movie> getAll() {
		return movieRepository.findAll();
	}

	@Override
	public Movie findOne(int id) {
		return movieRepository.findOne(id);
	}

}
