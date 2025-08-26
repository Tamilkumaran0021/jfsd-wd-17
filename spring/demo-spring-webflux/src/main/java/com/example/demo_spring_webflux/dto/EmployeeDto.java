package com.example.demo_spring_webflux.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
