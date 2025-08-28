package com.example.demo_spring_batch.repository;

import com.example.demo_spring_batch.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findByStatusAndEmailVerified(String status, boolean emailVerified, Pageable pageable);
}
