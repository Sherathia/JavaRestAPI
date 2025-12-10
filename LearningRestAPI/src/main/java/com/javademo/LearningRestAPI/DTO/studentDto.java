package com.javademo.LearningRestAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;


//As annotation added for getter and setter methods
@Data
@AllArgsConstructor
public class studentDto {

    private Long id;
    private String name;
    private String email;
    
}
