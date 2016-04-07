package my.restserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import my.restserver.entity.Movie;

@Service
public interface MovieService {
	Movie addMovie(Movie movie);
    void delete(int id);
    Movie editMovie(Movie movie);
    List<Movie> getAll();
    Movie findOne(int id);
}
