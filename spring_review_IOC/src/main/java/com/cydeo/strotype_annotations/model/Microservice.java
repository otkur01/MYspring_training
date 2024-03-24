package com.cydeo.strotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Microservice {

    public void Microservice(){
        System.out.println("total hours"+ 30);
    }
}
