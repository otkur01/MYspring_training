package com.example.spring_08_mvc_controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentController {
    @RequestMapping("/student")
    public String getStudentWelcome(){
        return "Student/Welcome.html";

    }
}
