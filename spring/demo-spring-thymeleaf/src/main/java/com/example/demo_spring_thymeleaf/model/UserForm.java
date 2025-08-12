package com.example.demo_spring_thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String profession;
}
