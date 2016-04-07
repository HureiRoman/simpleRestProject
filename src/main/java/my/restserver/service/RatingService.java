package my.restserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import my.restserver.entity.Rating;
@Service
public interface RatingService {
	Rating addRating(Rating rating);
    void delete(int id);
    Rating getByRating(int rating);
    Rating editRating(Rating rating);
    List<Rating> getAll();
    List<Rating> getRatingsWithNullDate();
    List<Rating> findByRatingOrRatingOrderByRatingDateAsc(int first, int second);
    List<String> getTitlesWithNoRatings();
}
