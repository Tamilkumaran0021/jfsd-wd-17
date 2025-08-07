package com.example.demo_springboot_mysql;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringbootMysqlApplication {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
//		modelMapper.createTypeMap(UserDto.class, User.class)
//				.addMapping(UserDto::getEmail, User::setFirstName);
        return modelMapper;
//		return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootMysqlApplication.class, args);
    }


}
