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
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        List<Course> courses = student.getCourses();
        List<Course> savedCourses = courseService.createCourses(courses);

        student.setCourses(savedCourses);
        return studentService.createStudent(student);
    }

}
