package com.cydeo.spring_010_mvc_model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model){
        System.out.println(make);
       model.addAttribute("make",make);
        return "car/carInfo";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "TOGG") String make, Model model){
        System.out.println(make);
        model.addAttribute("make",make);
        return "car/carInfo";
    }

    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String make, @RequestParam int year, Model model){

        model.addAttribute("make",make);
        model.addAttribute("year",year);
        return "car/carInfo";
    }
    @RequestMapping("info/{make}/{year}")
    public String getCarInfo(@PathVariable String make, @PathVariable int year){

        System.out.println(make);
        System.out.println(year);

        return "car/carInfo";
    }
}
