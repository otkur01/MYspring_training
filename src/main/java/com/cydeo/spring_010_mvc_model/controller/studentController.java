package com.cydeo.spring_010_mvc_model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
      model.addAttribute("name","Hekim");
        model.addAttribute("course","MVC");
      return "student/welcome";
    }
}
