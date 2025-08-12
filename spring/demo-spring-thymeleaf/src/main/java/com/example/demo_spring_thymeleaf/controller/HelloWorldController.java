package com.example.demo_spring_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!!!!");
        return "hello_world";
    }


}
