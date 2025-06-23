package com.sabrullasDevLab.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {

    @GetMapping
    public String welcomePage() {
        return "Welcome To My  i am just testing ";
    }
}
