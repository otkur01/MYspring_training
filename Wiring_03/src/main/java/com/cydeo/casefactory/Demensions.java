package com.cydeo.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Demensions {
    private int width;
    private int height;
    private int depth;

    public void pressPowerButton(){
        System.out.println("power button pressed");
    }

}
