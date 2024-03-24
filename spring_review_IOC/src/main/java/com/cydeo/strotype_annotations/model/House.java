package com.cydeo.strotype_annotations.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class House {

    public int getHourse(){
        return 10;
    }
}
