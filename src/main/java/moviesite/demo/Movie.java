package moviesite.demo;


import java.util.Date;



public class Movie {


    private String title;
    private int duration;
    private String genre;
    private String youtubeLink;
    private int movieId;

    public Movie(String title, int duration, String genre, int movieId) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.movieId = movieId;
    }

    public Movie() {
    }

    public Movie(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", youtubeLink='" + youtubeLink + '\'' +
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

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}