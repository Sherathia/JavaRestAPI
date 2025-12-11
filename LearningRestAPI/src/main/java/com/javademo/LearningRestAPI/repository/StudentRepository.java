package com.javademo.LearningRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javademo.LearningRestAPI.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
