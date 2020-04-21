package com.example.demo.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Rating;
import com.example.demo.model.UserRating;

@RestController
@RequestMapping("/movierating")
public class RatingDataResource {
	

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable ("movieId") String movieId) {
		return new Rating(movieId, 4);
		
	}
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable ("userId") String userId) {
	List<Rating> ratings=Arrays.asList(new  Rating("1234", 4),new  Rating("2345", 5));
	
	UserRating userRating = new UserRating();
	userRating.setUserRating(ratings);
	
	return userRating;

}
}