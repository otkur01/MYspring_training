package com.cydeo.beanAnnotations.config;

import com.cydeo.beanAnnotations.loosely_coupled.casefactory.Case;
import com.cydeo.beanAnnotations.loosely_coupled.casefactory.DellCase;
import com.cydeo.beanAnnotations.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.beanAnnotations.loosely_coupled.monitorfactory.SonyMonitor;
import com.cydeo.beanAnnotations.loosely_coupled.motherboardfactory.AsusMotherboard;
import com.cydeo.beanAnnotations.loosely_coupled.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class myCompurterConfig {
    @Bean(name = "sony")
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch Beast","Acer",25);
    }
@Bean(name = "Asuss")
@Primary
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
