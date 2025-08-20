package com.example.employee_service.service.impl;

import com.example.employee_service.dto.ApiResponseDto;
import com.example.employee_service.dto.DepartmentDto;
import com.example.employee_service.dto.EmployeeDto;
import com.example.employee_service.entity.Employee;
import com.example.employee_service.repository.EmployeeRepository;
import com.example.employee_service.service.ApiClient;
import com.example.employee_service.service.EmployeeService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;
    //    private RestTemplate restTemplate;
    private ApiClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee = employeeRepository.save(employee);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }

//    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Override
    public ApiResponseDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        // Department API Call
//        ResponseEntity<DepartmentDto> responseEntity = restTemplate
//                .getForEntity("http://localhost:8080/api/departments/" + employee.getDepartmentCode(), DepartmentDto.class);
//
//        DepartmentDto departmentDto = responseEntity.getBody();

        DepartmentDto departmentDto = apiClient.getDepartment(employee.getDepartmentCode());

        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);

        ApiResponseDto apiResponseDto = new ApiResponseDto(employeeDto, departmentDto);

        return apiResponseDto;
    }

    public ApiResponseDto getDefaultDepartment(Long employeeId, Exception exception) {
        System.out.println("Inside getDefaultDepartment method");
        Employee employee = employeeRepository.findById(employeeId).get();
        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);

        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentCode("ece");
        departmentDto.setDepartmentName("ece");
        departmentDto.setDepartmentDescription("Electronics and Comm");


        ApiResponseDto apiResponseDto = new ApiResponseDto(employeeDto, departmentDto);

        return apiResponseDto;
    }
}
