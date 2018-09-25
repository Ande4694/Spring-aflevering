package moviesite.demo;

import java.util.ArrayList;



public class UserRepo{

    ArrayList<Movie> movies = new ArrayList<Movie>();

    Movie movie1 = new Movie ("IT", 135, "Horror", 24091991);
    Movie movie2 = new Movie ("De Utrolige 2", 125, " Science fiction-film/Actionfilm", 26101997);
    Movie movie3 = new Movie ("The Raft", 97, "Dokumentarfilm", 64684631);
    Movie movie4 = new Movie ("Lykke-Per", 162, "Dramafilm", 49849843);
    Movie movie5 = new Movie ("Avengers: Infinity War", 160, "Fantasyfilm/Science fiction-film", 65487123);
    Movie movie6 = new Movie ("Deadpool 2", 120, "Fantasyfilm/Science fiction-film", 98762548);
    Movie movie7 = new Movie ("The Meg", 117, "Thrillerfilm/Fantasyfilm", 46821597);
    Movie movie8 = new Movie ("Mission: Impossible - Fallout", 148, "Thrillerfilm/Actionfilm", 63251497);
    Movie movie9 = new Movie ("The Nun", 96, "Mysterie/Thriller", 63285947);
    Movie movie10 = new Movie ("Solo: A Star Wars Story", 135, "Fantasyfilm/Science fiction-film", 39587164);
    Movie movie11 = new Movie ("A Quiet Place", 91, "Dramafilm/Thrillerfilm", 68791543);
    Movie movie12 = new Movie ("Early Man 2018", 100, "Fantasyfilm/Eventyrfilm", 69852331);
    Movie movie13 = new Movie ("padmavati", 164, "Dramafilm/Actionfilm", 12345678);
    Movie movie14 = new Movie ("Red Sparrow", 141, "Dramafilm/Thrillerfilm", 87654321);
    Movie movie15 = new Movie ("Mary Poppins Returns", 122, "Fantasyfilm/Musical", 16874235);
    Movie movie16 = new Movie ("Mile 22", 100, "Kriminalfilm/Thriller", 53974821);

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

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void addMovies(){
    //  constructor default

    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);
    movies.add(movie4);
}

public ArrayList<Movie> getAll(){

    return movies;

}

public UserRepo(){
    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);
    movies.add(movie4);
    movies.add(movie5);
    movies.add(movie6);
    movies.add(movie7);
    movies.add(movie8);
    movies.add(movie9);
    movies.add(movie10);
    movies.add(movie11);
    movies.add(movie12);
    movies.add(movie13);
    movies.add(movie14);
    movies.add(movie15);
    movies.add(movie16);


}

}