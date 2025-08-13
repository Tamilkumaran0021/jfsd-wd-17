package com.example.demo_spring_data.service;

import com.example.demo_spring_data.entity.Student;
import com.example.demo_spring_data.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


}
