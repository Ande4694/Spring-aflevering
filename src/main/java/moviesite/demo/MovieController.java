package moviesite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class MovieController {
    Logger log = Logger.getLogger(MovieController.class.getName());

    private String HOME = "home";
    private String MOVIE = "movie";
    private String NO = "no";
    private String ABOUT_US = "About_us";
    private String CREATE = "Create";
    UserRepo listOfMovies = new UserRepo();


    @GetMapping("")
    public String home() {

        log.info("index called");

        return HOME;
    }

    @GetMapping("/no")
    public String no() {

        log.info("no called");

        return NO;
    }

    @GetMapping("/Movie")
    public String Movie(Model model) {

        log.info("Movie called");


        model.addAttribute("Movies", listOfMovies.getAll());
        /// "Movies" er NØGLEN SOM VI KALDER!!!!!!!"!!!!!!"! i Movie html 130


        return MOVIE;
    }

    @GetMapping("/About_us")
    public String About_us() {

        log.info("About_us called");

        return ABOUT_US;
    }

    @GetMapping("/Create")
    public String Create(Model model) {

        log.info("Create called");
        model.addAttribute("movie", new Movie());


        return CREATE;
    }

    @RequestMapping(value = "/Create")
    public String movieToArray(
            @RequestParam("title") String title,
            @RequestParam("genre") String genre,
            @RequestParam("duration") int duration,
            @RequestParam("movieId") int movieId) throws Exception {


//        for (int i = 0; i<listOfMovies.movies.size();i++){
//            if(listOfMovies.movies.get(i).getMovieId()==(movieId)){
//                log.info("Someone tried to add a movie with a pre-existing movie ID");
//            } else {
//                listOfMovies.movies.add(new Movie(title, duration, genre, movieId));
//            }
//        }

        listOfMovies.movies.add(new Movie(title, duration, genre, movieId));


        return "redirect:/Movie";

    }
}






