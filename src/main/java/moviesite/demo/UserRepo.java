package moviesite.demo;

import org.springframework.ui.Model;

import java.util.ArrayList;



public class UserRepo {


    ArrayList<Movie> movies = new ArrayList<Movie>();

    Movie movie1 = new Movie ("hokus", 79, "Horror", 24091991);
    Movie movie2 = new Movie ("hokus", 79, "Horror", 24091991);
    Movie movie3 = new Movie ("hokus", 79, "Horror", 24091991);
    Movie movie4 = new Movie ("hokus", 79, "Horror", 24091991);

public Movie searchByTitle(String name){
    for (int i = 0; i<movies.size();i++){

        if(movies.get(i).getTitle().contains(name)){
            return movies.get(i);
        }
        // evt kald create funk
    }

    return null;
}



public void addMovie(Movie movie){
    this.movies.add(movie);
}

public ArrayList<Movie> save (Movie movie){
    movie.setDuration();
    movie.setTitle();
    movie.setMovieId();
    movie.setGenre();


    return movies;
}



public void addMovies(){
    //  constructor default


}

public ArrayList<Movie> getAll(){

    return movies;

}

public UserRepo(){
    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);
    movies.add(movie4);

}
}