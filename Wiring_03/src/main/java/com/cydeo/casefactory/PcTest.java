package com.cydeo.casefactory;

import com.cydeo.config.pcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PcTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(pcConfig.class);
        Case case1 = container.getBean(Case.class);
        System.out.println(case1);
        System.out.println(case1.getDemensions().getDepth());


    }
}
