package com.cydeo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Comment {
    private String author;
    private String text;
}
