package com.example.demo_springboot.controller;

import com.example.demo_springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(1, "john", "doe");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = Arrays.asList(
                new Student(1, "john", "doe"),
                new Student(2, "peter", "doe")
        );

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("query")
    public ResponseEntity<Student> getStudentRequestVariable(@RequestParam int id) {
        Student student = new Student(id, "john", "doe");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.NO_CONTENT);
    }
}
