package com.example.demo_spring_data.service;

import com.example.demo_spring_data.entity.Department;
import com.example.demo_spring_data.entity.Employee;
import com.example.demo_spring_data.repository.DepartmentRepository;
import com.example.demo_spring_data.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {
    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;

    @Transactional
    public Department createDepartmentWithEmployees(String departmentName, List<String> employeeNames) {
        Department department = new Department();
        department.setName(departmentName);

        List<Employee> employees = employeeNames.stream().map(employeeName -> {
            Employee employee = new Employee();
            employee.setName(employeeName);
            employee.setDepartment(department);
            return employee;
        }).toList();

        department.setEmployees(employees);
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id).get();
    }

    public List<Employee> getEmployeesByDepartment(Long departmentId){
        return employeeRepository.findByDepartmentId(departmentId);
    }

}
