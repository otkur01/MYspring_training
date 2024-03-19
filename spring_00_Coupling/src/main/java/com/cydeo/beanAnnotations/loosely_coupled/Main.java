package com.cydeo.beanAnnotations.loosely_coupled;

import com.cydeo.beanAnnotations.loosely_coupled.motherboardfactory.Motherboard;
import com.cydeo.beanAnnotations.loosely_coupled.casefactory.Case;
import com.cydeo.beanAnnotations.loosely_coupled.casefactory.DellCase;
import com.cydeo.beanAnnotations.loosely_coupled.monitorfactory.AcerMonitor;
import com.cydeo.beanAnnotations.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.beanAnnotations.loosely_coupled.motherboardfactory.AsusMotherboard;


public class Main {
    public static void main(String[] args) {

        Monitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
        Case theCase = new DellCase("220B", "Dell", "240");
        Motherboard theMotherboard = new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPc = new PC(theCase,theMonitor,theMotherboard);

        myPc.powerUp();


    }
}
