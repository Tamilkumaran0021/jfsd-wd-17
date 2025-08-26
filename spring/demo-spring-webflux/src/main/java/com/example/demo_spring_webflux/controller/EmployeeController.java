package com.example.demo_spring_webflux.controller;

import com.example.demo_spring_webflux.dto.EmployeeDto;
import com.example.demo_spring_webflux.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping("{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Mono<EmployeeDto> getEmployee(@PathVariable("id") String id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public Flux<EmployeeDto> getEmployees() {
        return employeeService.getEmployees();
    }


}
