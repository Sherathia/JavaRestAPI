package com.javademo.LearningRestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javademo.LearningRestAPI.DTO.studentDto;

@RestController
public class StudentController {
    

    @GetMapping("/student")
    public studentDto getStudent() {
        return new studentDto(1L, "John Doe", "john.doe@example.com");
    }
    
}
