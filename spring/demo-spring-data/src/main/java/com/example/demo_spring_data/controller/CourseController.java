package com.example.demo_spring_data.controller;

import com.example.demo_spring_data.entity.Course;
import com.example.demo_spring_data.entity.Student;
import com.example.demo_spring_data.service.CourseService;
import com.example.demo_spring_data.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {
    private StudentService studentService;
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

}
