package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute( "books",repository.findAll());
        return "books";
    }
}
