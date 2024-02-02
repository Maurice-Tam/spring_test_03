package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!!!";
    }

    @RequestMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello World 2 (on Github)!!!";
    }

}
