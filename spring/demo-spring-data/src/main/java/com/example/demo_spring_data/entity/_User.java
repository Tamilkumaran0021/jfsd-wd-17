package com.example.demo_spring_data.entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class _User {
    @Id
    private String id;
    private String name;

    @DBRef
    private _UserProfile userProfile;
}

@Document
@Data
class _UserProfile {
    @Id
    private String id;
    private String bio;
}