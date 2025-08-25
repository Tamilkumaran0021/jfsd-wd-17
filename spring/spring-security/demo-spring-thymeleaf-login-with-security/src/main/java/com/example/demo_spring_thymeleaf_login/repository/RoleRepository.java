package com.example.demo_spring_thymeleaf_login.repository;

import com.example.demo_spring_thymeleaf_login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
