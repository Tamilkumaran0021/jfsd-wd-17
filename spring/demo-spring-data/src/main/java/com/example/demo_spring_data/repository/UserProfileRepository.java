package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
