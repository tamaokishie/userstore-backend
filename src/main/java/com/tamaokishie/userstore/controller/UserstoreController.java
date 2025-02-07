package com.tamaokishie.userstore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserstoreController {
    
    @GetMapping("/user")
    public String getUser() {
        return "user name";
    }
    
}
