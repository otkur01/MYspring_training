package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Demensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class pcConfig {
     @Bean
    public Demensions demensions(){
        return new Demensions(10,20,30);
    }
    @Bean
    public Case caseDell(Demensions demensions){

        return new DellCase("Gaming","Dell","220v",demensions );
    }


}
