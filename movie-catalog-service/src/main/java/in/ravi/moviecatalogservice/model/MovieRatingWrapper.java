package in.ravi.moviecatalogservice.model;

import java.util.List;

public class MovieRatingWrapper {
    private List<MovieRating> movieRatingList;

    public MovieRatingWrapper() {
    }

    public List<MovieRating> getMovieRatingList() {
        return movieRatingList;
    }

    public void setMovieRatingList(List<MovieRating> movieRatingList) {
        this.movieRatingList = movieRatingList;
    }
}
