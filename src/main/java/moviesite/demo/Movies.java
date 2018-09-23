package moviesite.demo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import static com.sun.javafx.print.Units.MM;

@Entity
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private int duration;
    private String genre;
    private String youtubeLink;
    private Date year;
    private int movieId;

    public Movies(int duration, String genre, String youtubeLink, Date year, int movieId) {
        this.duration = duration;
        this.genre = genre;
        this.youtubeLink = youtubeLink;
        this.year = year;
        this.movieId = movieId;
    }

    public Movies() {
    }

    public Movies(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", youtubeLink='" + youtubeLink + '\'' +
                ", year=" + year +
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}


