package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.Config.pcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PcTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(pcConfig.class);
        PC Mypc = container.getBean(PC.class);
        System.out.println(Mypc.getMonitor().getSize());




    }
}
