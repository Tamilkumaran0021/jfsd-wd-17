package com.example.demo_spring_webflux.service;

import com.example.demo_spring_webflux.dto.EmployeeDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

    Mono<EmployeeDto> getEmployee(String employeeId);

    Flux<EmployeeDto> getEmployees();

    Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId);

    Mono<Void> deleteEmployee(String employeeId);
}
