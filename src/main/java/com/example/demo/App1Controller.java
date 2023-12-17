package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    @GetMapping("/api/v1/app1")
    public String getApp1() {
        return "Hello World from App1!!!";
    }

    @GetMapping("/api/v1/app1/hello")
    public String getAppHello() {
        return "Hello World from App1 (hello)!!! ";
    }

}
