package moviesite.demo;

import java.util.List;

public class MovieCreator {

    private List<Movies> movies;

    public MovieCreator(List<Movies> movies) {
        this.movies = movies;
    }

    public MovieCreator() {
    }

    public void addMovie(Movies movies){
        this.movies.add(movies);
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }
}
