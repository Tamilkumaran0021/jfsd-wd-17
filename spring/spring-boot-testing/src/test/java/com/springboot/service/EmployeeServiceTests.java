package com.springboot.service;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {
    @Mock
    private EmployeeRepository employeeRepository;
    @InjectMocks
    private EmployeeServiceImpl employeeService;

    static Employee employee;

    @BeforeAll
    public static void setUp() {
        employee = new Employee();
        employee.setFirstName("john");
        employee.setLastName("doe");
        employee.setEmail("john@gmail.com");
    }

    @Test
    public void givenEmployeeObject_whenSave_thenReturnSavedEmployee() {

        //given
        given(employeeRepository.findByEmail(employee.getEmail()))
                .willReturn(Optional.empty());
        given(employeeRepository.save(employee))
                .willReturn(employee);

        // when
        Employee savedEmployee = employeeService.saveEmployee(employee);

        // then
        assertThat(savedEmployee).isNotNull();
    }

    @Test
    public void givenExistingEmail_whenSave_thenThrowsException() {
        //given
        given(employeeRepository.findByEmail(employee.getEmail()))
                .willReturn(Optional.of(employee));

        // when
        assertThrows(ResourceNotFoundException.class, () -> employeeService.saveEmployee(employee));

        // then
        verify(employeeRepository, never()).save(any(Employee.class));
    }

    @Test
    public void givenEmployeesList_whenFindAll_thenReturnEmployeesList() {
        given(employeeRepository.findAll()).willReturn(List.of(employee));

        List<Employee> employees = employeeService.getAllEmployees();

        assertThat(employees).isNotNull();
        assertThat(employees.size()).isEqualTo(1);
    }

    @Test
    public void givenEmployeesList_whenFindAll_thenReturnEmptyEmployeesList() {
        given(employeeRepository.findAll()).willReturn(Collections.emptyList());

        List<Employee> employees = employeeService.getAllEmployees();

        assertThat(employees).isNotNull();
        assertThat(employees.size()).isEqualTo(0);
    }

    @Test
    public void givenEmployeeId_whenDeleteEmployee_thenNothing() {
        long employeeId = 1l;
        willDoNothing().given(employeeRepository).deleteById(employeeId);

        employeeService.deleteEmployee(employeeId);
        verify(employeeRepository, times(1)).deleteById(employeeId);
    }


}
