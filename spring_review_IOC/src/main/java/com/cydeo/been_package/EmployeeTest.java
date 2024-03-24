package com.cydeo.been_package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FullTimeEmployee fullTimeEmployee = context.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = context.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();


    }
}
