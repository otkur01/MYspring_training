package com.cydeo.been_package;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StringTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StringConfig.class);
        String s1 = context.getBean( String.class);
        String s2 = context.getBean(String.class);

        System.out.println(s1);
        System.out.println(s2);

    }
}
