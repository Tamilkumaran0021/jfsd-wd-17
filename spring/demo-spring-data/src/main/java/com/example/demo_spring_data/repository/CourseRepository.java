package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
