package in.ravi.ratingmovieservice.controller;

import in.ravi.ratingmovieservice.model.MovieRating;
import in.ravi.ratingmovieservice.model.MovieRatingWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class RatingMovieController {

    @RequestMapping("/rating/{userId}")
    public MovieRatingWrapper getRatingData(String userId) {
        List<MovieRating> ratings= Arrays.asList(
                new MovieRating("abc", 4)
        );
        MovieRatingWrapper movieRatingWrapper = new MovieRatingWrapper();
        movieRatingWrapper.setMovieRatingList(ratings);
        return movieRatingWrapper;
    }
}
