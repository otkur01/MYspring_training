package com.hekim.beanAnnotations;
import com.hekim.beanAnnotations.config.StringIntegerConfig;
import com.hekim.beanAnnotations.loosely_coupled.PC;

import com.hekim.beanAnnotations.config.myCompurterConfig;
import com.hekim.beanAnnotations.loosely_coupled.casefactory.Case;
import com.hekim.beanAnnotations.loosely_coupled.monitorfactory.Monitor;
import com.hekim.beanAnnotations.loosely_coupled.monitorfactory.SonyMonitor;
import com.hekim.beanAnnotations.loosely_coupled.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComputerTest {
    public static void main(String[] args) {

       ApplicationContext container = new AnnotationConfigApplicationContext(myCompurterConfig.class, StringIntegerConfig.class);
      //Monitor monitor= container.getBean(Monitor.class);
        SonyMonitor themonter = container.getBean(SonyMonitor.class);
        Case myCase = container.getBean(Case.class);
        Motherboard motherboard = container.getBean(Motherboard.class);

      PC myPc = new PC(myCase,themonter,motherboard);
      myPc.powerUp();
      String s = container.getBean(String.class);
        System.out.println(s);

    }

}
