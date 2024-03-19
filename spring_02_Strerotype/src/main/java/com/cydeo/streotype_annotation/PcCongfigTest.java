package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.PCconfig.pcConfig;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PcCongfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(pcConfig.class);
        Monitor theMonitor = context.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());

    }
}
