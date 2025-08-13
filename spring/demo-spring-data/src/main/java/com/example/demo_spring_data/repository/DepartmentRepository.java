package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
