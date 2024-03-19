package com.cydeo.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Demensions demensions;



    public abstract void pressPowerButton();
}
