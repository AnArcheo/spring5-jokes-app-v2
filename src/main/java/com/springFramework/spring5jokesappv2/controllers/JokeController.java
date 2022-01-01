package com.springFramework.spring5jokesappv2.controllers;


import com.springFramework.spring5jokesappv2.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    //@Autowired // spring will automatically inject this controller instance no need for Autowired
    public JokeController(JokeService jokeService) { // controller initialize Joke service
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
