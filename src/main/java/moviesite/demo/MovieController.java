package moviesite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class MovieController {
    Logger log = Logger.getLogger(MovieController.class.getName());

    private String HOME = "home";
    private String MOVIE = "movie";
    private String NO = "no";
    private String ABOUT_US = "About_us";


    @GetMapping("")
    public String home(){

        log.info("index called");

        return HOME;
    }

    @GetMapping("create")
    public String create (){

        log.info("someone tried to create something");

        return "create";
    }

    @GetMapping ("edit")
    public String edit (){

        log.info("now someone is trying to edit your stuff");

        return "edit";
    }

    @GetMapping("/no")
    public String no(){

        log.info("no called");

        return NO;
    }

    @GetMapping("/Movie")
    public String Movie(Model model){


        log.info("Movie called");

        return MOVIE;
    }

    @GetMapping("/About_us")
    public String About_us(){

        log.info("About_us called");

        return ABOUT_US;
    }


}
