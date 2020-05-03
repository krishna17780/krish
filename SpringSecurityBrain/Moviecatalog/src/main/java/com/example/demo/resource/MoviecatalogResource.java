package com.example.demo.resource;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Catalogies;
import com.example.demo.model.Movie;
import com.example.demo.model.Rating;
import com.example.demo.model.UserRating;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@RestController
@RequestMapping("/moviecatalog")
public class MoviecatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	@Hystrix
	public List<Catalogies> getCatalog(@PathVariable String userid) {
		
		
		UserRating rating=restTemplate.getForObject("http://localhost:8084/movierating/users/"+userid, UserRating.class);
		
		return rating.getUserRating().stream().map(ratings ->{
		Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+ratings.getMovieId(), Movie.class);
		
	 return	new Catalogies(movie.getName(), "love movie", ratings.getRating());
		})
				.collect(Collectors.toList());
	}
}
