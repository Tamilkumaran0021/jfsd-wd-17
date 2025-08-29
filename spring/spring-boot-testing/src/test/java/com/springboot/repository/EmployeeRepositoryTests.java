package com.springboot.repository;

import com.springboot.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
public class EmployeeRepositoryTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @DisplayName("Test for save employee operation")
    @Test
    public void givenEmployeeObject_whenSave_thenReturnSavedEmployee() {
        // given
        Employee employee = new Employee();
        employee.setFirstName("john");
        employee.setLastName("doe");
        employee.setEmail("john@gmail.com");

        // when
        Employee savedEmployee = employeeRepository.save(employee);

        // then
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }

    @Test
    public void givenEmployeesList_whenFindAll_thenReturnEmployeesList() {
        Employee employee = new Employee();
        employee.setFirstName("john");
        employee.setLastName("doe");
        employee.setEmail("john@gmail.com");

        Employee employee1 = new Employee();
        employee1.setFirstName("peter");
        employee1.setLastName("doe");
        employee1.setEmail("peter@gmail.com");

        employeeRepository.save(employee);
        employeeRepository.save(employee1);

        List<Employee> employees = employeeRepository.findAll();

        assertThat(employees).isNotNull();
        assertThat(employees.size()).isEqualTo(2);
    }

    @Test
    public void givenEmployee_whenFindById_thenReturnEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("john");
        employee.setLastName("doe");
        employee.setEmail("john@gmail.com");

        employeeRepository.save(employee);

        Optional<Employee> _employee = employeeRepository.findById(employee.getId());

        assertThat(_employee).isNotNull();
    }

    @Test
    public void givenEmployee_whenUpdateEmployee_thenReturnUpdatedEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("john");
        employee.setLastName("doe");
        employee.setEmail("john@gmail.com");

        employeeRepository.save(employee);

        Employee _employee = employeeRepository.findById(employee.getId()).get();
        _employee.setEmail("peter@gmail.com");
        Employee updatedEmployee = employeeRepository.save(_employee);

        assertThat(updatedEmployee.getEmail()).isEqualTo("peter@gmail.com");
    }


}
