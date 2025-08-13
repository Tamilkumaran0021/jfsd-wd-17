package com.example.demo_spring_data.controller;

import com.example.demo_spring_data.entity.Department;
import com.example.demo_spring_data.entity.Employee;
import com.example.demo_spring_data.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestParam String departmentName,
                                                       @RequestParam List<String> employeeNames) {
        Department department = departmentService.createDepartmentWithEmployees(departmentName, employeeNames);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id) {
        Department department = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @GetMapping("/{id}/employees")
    public ResponseEntity<List<Employee>> getEmployees(@PathVariable Long id) {
        List<Employee> employees = departmentService.getEmployeesByDepartment(id);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
