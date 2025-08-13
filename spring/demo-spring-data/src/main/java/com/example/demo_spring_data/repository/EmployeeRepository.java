package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long departmentId);

    @Query("select e from employee e where e.salary > :_salary") // JPQL
    List<Employee> findEmployeesWithSalaryGreaterThan(@Param("_salary") double salary);
}
