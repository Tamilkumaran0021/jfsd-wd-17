package com.example.demo_spring_webflux.repository;

import com.example.demo_spring_webflux.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee,String> {
}
