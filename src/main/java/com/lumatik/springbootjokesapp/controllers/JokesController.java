package com.lumatik.springbootjokesapp.controllers;

import com.lumatik.springbootjokesapp.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private ChuckNorrisJokeService chuckNorrisJokeService;

    @Autowired
    public JokesController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @GetMapping({"/", ""})
    public String getRandomChuckNorrisJoke(Model model){
        model.addAttribute("joke", chuckNorrisJokeService.getRandomChuckNorrisJoke());
        return "chucknorris";
    }
}
