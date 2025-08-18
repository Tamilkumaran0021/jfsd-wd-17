package com.example.demo_spring_thymeleaf_login.service;

import com.example.demo_spring_thymeleaf_login.dto.UserDto;

import java.util.List;

public interface UserService {
    void createUser(UserDto userDto);
    UserDto findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
