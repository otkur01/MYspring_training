package com.cydeo.strotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
@Component
public class DataStructure {
  @NonNull
   private House house;

    public void dataStructure(){
        System.out.println("total hours"+ (20+house.getHourse()));
    }
}
