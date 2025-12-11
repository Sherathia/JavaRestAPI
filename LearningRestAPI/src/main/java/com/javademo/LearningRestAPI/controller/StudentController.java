package com.javademo.LearningRestAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javademo.LearningRestAPI.DTO.studentDto;
import com.javademo.LearningRestAPI.entity.Student;
import com.javademo.LearningRestAPI.repository.StudentRepository;

@RestController
public class StudentController {
    
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public studentDto getStudentById(Long id) {
        return new studentDto(id, "John Doe", "john.doe@example.com");
    }
    
}
