package com.cydeo.spring_010_mvc_model.controller;

import com.cydeo.spring_010_mvc_model.Enums.Gender;
import com.cydeo.spring_010_mvc_model.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorControllor {

    @RequestMapping("/list")
    public String Showlist(Model model){
        List<Mentor>mentorList = new ArrayList<>();
        Mentor mentor1 =new Mentor("Hekim","Otkur",30, Gender.MALE);

            Mentor mentor2 =new Mentor("salim","kazim",20,Gender.MALE);

            Mentor mentor3 =new Mentor("ibrahim","otkur",10,Gender.MALE);
        Mentor mentor4 =new Mentor("ibrahim","otkur",10,Gender.MALE);
          mentorList.add(mentor1);
          mentorList.add(mentor2);
          mentorList.add(mentor3);
          model.addAttribute("mentors",mentorList);
         // model.addAttribute("monter4",mentor4);
        return "mentor/Mentor";
    }
}
