package com.example.testback.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/hello")
    public String restAPI() {
        return " hello world ";
    }
}
