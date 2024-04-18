package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHello() {
        return "Hello World!!! - April 2024 - (branch01)";
    }

     @GetMapping("/azure")
    public String getHelloAzure() {
        return "Hello Azure!!! (on Github)";
    }

    @RequestMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello World 2 (on Github)!!!";
    }

}
