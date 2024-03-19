package com.cydeo.beanAnnotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringIntegerConfig {
   @Bean
    public String myString(){
        return "this my string config";
    }
    @Bean
    public Integer myInteger(){
       return 100;
    }
}
