package com.example.demo_spring_batch.repository;

import com.example.demo_spring_batch.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
