package com.cydeo.streotype_annotation.casefactory;

import com.cydeo.casefactory.Demensions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter

public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    @Autowired
    private Demensions demensions;

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;

    }

    public abstract void pressPowerButton();

}
