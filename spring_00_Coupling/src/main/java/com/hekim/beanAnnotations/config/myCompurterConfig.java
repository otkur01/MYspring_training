package com.hekim.beanAnnotations.config;

import com.hekim.beanAnnotations.loosely_coupled.casefactory.Case;
import com.hekim.beanAnnotations.loosely_coupled.casefactory.DellCase;
import com.hekim.beanAnnotations.loosely_coupled.monitorfactory.Monitor;
import com.hekim.beanAnnotations.loosely_coupled.monitorfactory.SonyMonitor;
import com.hekim.beanAnnotations.loosely_coupled.motherboardfactory.AsusMotherboard;
import com.hekim.beanAnnotations.loosely_coupled.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myCompurterConfig {
    @Bean
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch Beast","Acer",25);
    }
    @Bean
    public Monitor monitorAsuss(){
        return new SonyMonitor("24 inch Beast","sony",25);
    }
    @Bean
    public Case caseDell(){
        return new DellCase("Gaming","Dell","220v");
    }
    @Bean
    public Motherboard motherboardAssus(){
        return new AsusMotherboard("Monster","Asus",4,6,"2.24v");
    }
}
