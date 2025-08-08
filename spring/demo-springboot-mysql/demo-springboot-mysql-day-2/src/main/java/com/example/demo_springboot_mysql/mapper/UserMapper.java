package com.example.demo_springboot_mysql.mapper;

import com.example.demo_springboot_mysql.dto.UserDto;
import com.example.demo_springboot_mysql.entity.User;

public class UserMapper {
    // dto -> entity
    public static User mapToUser(UserDto userDto) {
        User user = new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
        return user;
    }


    // entity -> dto
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
        return userDto;
    }
}
