package my.restserver.repository;

import java.util.List;

import my.restserver.entity.Rating;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface RatingRepository  extends JpaRepository<Rating, Integer>{
	
	Rating findByRating(int rating);
	
	@Query("SELECT r FROM Rating r WHERE r.ratingDate = null")
	List<Rating> getRatingsWithNullDate();
	
	List<Rating> findByRatingOrRatingOrderByRatingDateAsc(int first, int second);
	
	@Query(value = "Select title FROM Movie m WHERE m.id NOT IN (Select movieId FROM Rating r)",nativeQuery=true)
	List<String> getTitlesWithNoRatings();
}
