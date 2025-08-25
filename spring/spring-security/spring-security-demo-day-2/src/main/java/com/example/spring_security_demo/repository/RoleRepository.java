package com.example.spring_security_demo.repository;

import com.example.spring_security_demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
