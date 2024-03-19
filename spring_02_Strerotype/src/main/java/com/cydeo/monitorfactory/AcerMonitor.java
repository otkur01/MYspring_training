package com.cydeo.monitorfactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class AcerMonitor extends Monitor {

    public AcerMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }


}