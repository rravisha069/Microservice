package in.ravi.moviecatalogservice.model;

public class MovieRating {
    private String movieId;
    private int movieRating;

    public MovieRating() {
    }

    public MovieRating(String movieId, int movieRating) {
        this.movieId = movieId;
        this.movieRating = movieRating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
}
