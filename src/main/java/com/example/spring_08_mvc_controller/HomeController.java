package com.example.spring_08_mvc_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(){
        return "home.html";

    }
    @RequestMapping("/hekim")
    public String getHomePage2(){
        return "home.html";

    }
    @RequestMapping
    public String getHomePage1(){
        return "home.html";

    }
    @RequestMapping({"/apple","/orange"})
    public String getHomePage3(){
        return "home.html";

    }
}
