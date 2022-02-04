package in.ravi.movieinfoservice.controller;

import in.ravi.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class MovieInfoController {

    @RequestMapping("/info/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return new Movie("abc", "Spider man", "Spider man, No way Home");
    }
}
