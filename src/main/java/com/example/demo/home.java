package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public String Home(){
        return "<h1>Welcome to the Deployment Class<h1>" +
                "<p>This is a simple Spring Boot application.</p>";
    }
}
