package moviesite.demo;


public class Movie {


    private String title;
    private int duration;
    private String genre;
    private int movieId;

    public Movie(String title, int duration, String genre, int movieId) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.movieId = movieId;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", movieId=" + movieId +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}