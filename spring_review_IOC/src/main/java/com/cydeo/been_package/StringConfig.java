package com.cydeo.been_package;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class StringConfig {
    @Bean(name = "str")
    @Primary
  public   String str(){
        return "Welcome to Cydeo";
    }
    @Bean(name = "str1")
    public String str1(){
        return "Spring core practice";
    }


}
