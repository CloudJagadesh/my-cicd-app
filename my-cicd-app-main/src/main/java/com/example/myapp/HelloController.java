package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from the CI/CD pipeline! Build is live and running in Docker!S";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

}
