package com.cydeo.spring_010_mvc_model.model;

import com.cydeo.spring_010_mvc_model.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String firstName,lastName;
    private int age;
    private Gender gender;

}
