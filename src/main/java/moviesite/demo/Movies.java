package moviesite.demo;

public class Movies {

    private String title;
    private int year;
    private int duration;
    private String genre;

    // kan måske bruges
    private String youtubeLink;

    public Movies(String title, int year, int duration, String genre, String youtubeLink) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.youtubeLink = youtubeLink;
    }

    public Movies() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
}
