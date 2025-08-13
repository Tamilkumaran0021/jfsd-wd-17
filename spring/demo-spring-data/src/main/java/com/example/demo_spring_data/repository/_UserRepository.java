package com.example.demo_spring_data.repository;

import com.example.demo_spring_data.entity._User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  _UserRepository extends MongoRepository<_User,String> {
}
