package com.cydeo.streotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class AcerMonitor extends Monitor{
    public AcerMonitor() {
        super("25 inch beast","Acer",20);;
    }

    @Override
    public void drawPixelAt() {

    }
}
