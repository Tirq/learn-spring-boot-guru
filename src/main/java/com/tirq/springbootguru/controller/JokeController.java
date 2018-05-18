package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String getRandomQuote(Model model) {
        model.addAttribute("text", jokeService.getRandomQuote());
        return "joke";
    }
}