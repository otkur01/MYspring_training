package com.cydeo.streotype_annotation.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Demensions {

    private int width;

    private int height;
    private int depth;
    public Demensions() {
        this.width=10;
        this.height=30;
        this.depth=40;
    }


    public void pressPowerButton(){
        System.out.println("power button pressed");
    }

}