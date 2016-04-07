package my.restserver.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	@Column(name = "id")
	private int movieId;

	@Column(name = "title")
	private String title;

	@Column(name = "director")
	private String director;
	
	@OneToMany(mappedBy="movie")
	private Collection<Rating> rating = new ArrayList<Rating>();	

	public Collection<Rating> getRating() {
		return rating;
	}

	public void setRating(Collection<Rating> rating) {
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
