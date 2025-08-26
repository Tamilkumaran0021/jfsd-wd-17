package com.example.demo_spring_webflux.service.impl;

import com.example.demo_spring_webflux.dto.EmployeeDto;
import com.example.demo_spring_webflux.entity.Employee;
import com.example.demo_spring_webflux.repository.EmployeeRepository;
import com.example.demo_spring_webflux.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;

    @Override
    public Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto) {

        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Mono<Employee> employeeMono = employeeRepository.save(employee);
        return employeeMono.map(employee1 -> modelMapper.map(employee1, EmployeeDto.class));
    }

    @Override
    public Mono<EmployeeDto> getEmployee(String employeeId) {
        Mono<Employee> employeeMono = employeeRepository.findById(employeeId);
        return employeeMono.map(employee1 -> modelMapper.map(employee1, EmployeeDto.class));
    }

    @Override
    public Flux<EmployeeDto> getEmployees() {

        Flux<Employee> employeeFlux = employeeRepository.findAll();
        return employeeFlux.map(employee -> modelMapper.map(employee, EmployeeDto.class));
    }

    @Override
    public Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId) {
        return null;
    }

    @Override
    public Mono<Void> deleteEmployee(String employeeId) {
        return null;
    }
}
