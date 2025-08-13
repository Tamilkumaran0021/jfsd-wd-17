package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
