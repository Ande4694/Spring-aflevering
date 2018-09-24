package moviesite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String home(){

        log.info("index called");

        return HOME;
    }

    @GetMapping("/no")
    public String no(){

        log.info("no called");

        return NO;
    }

    @GetMapping("/Movie")
    public String Movie(Model model){

        log.info("Movie called");



        model.addAttribute("Movies", listOfMovies.getAll());
        /// "Movies" er NØGLEN SOM VI KALDER!!!!!!!"!!!!!!"! i Movie html 93


        return MOVIE;
    }

    @GetMapping("/About_us")
    public String About_us(){

        log.info("About_us called");

        return ABOUT_US;
    }

    @GetMapping("/Create")
    public String Create(Model model){

        log.info("Create called");
        model.addAttribute("Movies", new Movie());


        return CREATE;
    }

    @PostMapping("/Create")
    public String Create(@ModelAttribute Movie movie, Model model){

        log.info("some monkey created something");
        listOfMovies.create();
        model.addAttribute("Moives", listOfMovies.getAll());

        return "redirect:/";

    }




}
