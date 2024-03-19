package com.cydeo.beanAnnotations;
import com.cydeo.beanAnnotations.config.StringIntegerConfig;
import com.cydeo.beanAnnotations.loosely_coupled.PC;

import com.cydeo.beanAnnotations.config.myCompurterConfig;
import com.cydeo.beanAnnotations.loosely_coupled.casefactory.Case;
import com.cydeo.beanAnnotations.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.beanAnnotations.loosely_coupled.monitorfactory.SonyMonitor;
import com.cydeo.beanAnnotations.loosely_coupled.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComputerTest {
    public static void main(String[] args) {

       ApplicationContext container = new AnnotationConfigApplicationContext(myCompurterConfig.class, StringIntegerConfig.class);


        Monitor monitor2 = container.getBean("sony", Monitor.class);
        Monitor monitor3 = container.getBean("sony", Monitor.class);
        Monitor monitor4 = container.getBean("sony", Monitor.class);
        SonyMonitor themonter = container.getBean("Asuss",SonyMonitor.class);
        Case myCase = container.getBean(Case.class);
        Motherboard motherboard = container.getBean(Motherboard.class);

      PC myPc = new PC(myCase,themonter,motherboard);
      myPc.powerUp();
      String s = container.getBean(String.class);
        System.out.println(s);
        myCase.pressPowerButton();

    }

}
