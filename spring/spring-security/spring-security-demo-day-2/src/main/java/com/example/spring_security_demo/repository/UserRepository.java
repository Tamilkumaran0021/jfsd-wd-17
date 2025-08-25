package com.example.spring_security_demo.repository;

import com.example.spring_security_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByUsernameOrEmail(String username, String email);

    Boolean existsByEmail(String email);
}
