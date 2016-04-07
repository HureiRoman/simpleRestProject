package my.restserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import my.restserver.entity.Rating;
import my.restserver.repository.RatingRepository;
import my.restserver.service.RatingService;
@Service
@ComponentScan(basePackages={"my.restserver.repository"})
public class RatingServiceImpl implements RatingService {
	
	 @Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating addRating(Rating rating) {
		return ratingRepository.saveAndFlush(rating);
	}

	@Override
	public void delete(int id) {
	ratingRepository.delete(id);	
	}

	@Override
	public Rating getByRating(int rating) {
		return ratingRepository.findByRating(rating);
	}

	@Override
	public Rating editRating(Rating rating) {
	return ratingRepository.saveAndFlush(rating);
	}

	@Override
	public List<Rating> getAll() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingsWithNullDate() {
		return ratingRepository.getRatingsWithNullDate();
	}

	@Override
	public List<Rating> findByRatingOrRatingOrderByRatingDateAsc(int first,
			int second) {
		return ratingRepository.findByRatingOrRatingOrderByRatingDateAsc(first, second);
	}

	@Override
	public List<String> getTitlesWithNoRatings() {
		return ratingRepository.getTitlesWithNoRatings();
	}

}
