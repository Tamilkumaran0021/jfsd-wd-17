package com.example.spring_security_demo.repository;

import com.example.spring_security_demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
