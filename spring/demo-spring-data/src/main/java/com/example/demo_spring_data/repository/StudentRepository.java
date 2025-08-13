package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
