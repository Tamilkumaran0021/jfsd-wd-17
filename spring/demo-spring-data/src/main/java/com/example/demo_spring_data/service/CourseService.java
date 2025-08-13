package com.example.demo_spring_data.service;

import com.example.demo_spring_data.entity.Course;
import com.example.demo_spring_data.entity.Student;
import com.example.demo_spring_data.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    private CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }


    public List<Course> createCourses(List<Course> courses) {
        return courseRepository.saveAll(courses);
    }


    public Course getCourse(Long id) {
        return courseRepository.findById(id).get();
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

}
