package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.ChuckNorrisJokeServiceImpl;

@Controller
//@RequestMapping({"/", ""})
public class JokesController {

    @Autowired
    ChuckNorrisJokeServiceImpl chuckNorrisJokeService;

    @GetMapping({"/", ""})
    public String getRandomChuckNorrisJoke(Model model){
        model.addAttribute("joke", chuckNorrisJokeService.getRandomChuckNorrisJoke());
        return "chucknorris";
    }
}
