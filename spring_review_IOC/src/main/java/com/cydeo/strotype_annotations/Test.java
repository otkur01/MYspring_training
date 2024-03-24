package com.cydeo.strotype_annotations;

import com.cydeo.strotype_annotations.Cofig.CofigCourse;
import com.cydeo.strotype_annotations.model.DataStructure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(CofigCourse.class);
        DataStructure dataStructure = context.getBean(DataStructure.class);
        dataStructure.dataStructure();

    }
}
