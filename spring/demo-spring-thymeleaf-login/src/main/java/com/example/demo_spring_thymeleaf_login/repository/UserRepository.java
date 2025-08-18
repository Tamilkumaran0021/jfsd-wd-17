package com.example.demo_spring_thymeleaf_login.repository;

import com.example.demo_spring_thymeleaf_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
