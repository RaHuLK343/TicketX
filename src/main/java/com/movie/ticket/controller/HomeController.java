package com.movie.ticket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Welcome Movie Lovers";
    }

    @RequestMapping("/about")
    public String about(){
        return "Place to buy and sell extra Movie Tickets";
    }
}
