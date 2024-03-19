package com.cydeo.casefactory;

public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply, Demensions demensions) {
        super(model, manufacturer, powerSupply, demensions);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }

}
