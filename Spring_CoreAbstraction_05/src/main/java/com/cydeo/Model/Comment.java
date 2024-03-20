package com.cydeo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class Comment {
    private String author;
    private String text;
}
