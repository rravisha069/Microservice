package in.ravi.moviecatalogservice.controller;

import in.ravi.moviecatalogservice.model.Movie;
import in.ravi.moviecatalogservice.model.MovieDetails;
import in.ravi.moviecatalogservice.model.MovieRating;
import in.ravi.moviecatalogservice.model.MovieRatingWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieCatalogController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/catalog/{userId}")
    public List<MovieDetails> getMovieCatalog(@PathVariable("userId") String userId) {
        MovieRatingWrapper movieRatings = restTemplate.getForObject("http://rating-data-service/rating/"+userId, MovieRatingWrapper.class);

        List<MovieDetails> movies = movieRatings.getMovieRatingList().stream().map(movie -> {
                    return restTemplate.getForObject("http://movie-info-service/info/"+movie.getMovieId(), MovieDetails.class);
                }).collect(Collectors.toList());
        return movies;
    }
}
