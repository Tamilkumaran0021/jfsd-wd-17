package com.example.demo_spring_data.service;

import com.example.demo_spring_data.entity.User;
import com.example.demo_spring_data.entity.UserProfile;
import com.example.demo_spring_data.repository.UserProfileRepository;
import com.example.demo_spring_data.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private UserProfileRepository userProfileRepository;

    public User createUserWithProfile(String name, String bio) {
        UserProfile userProfile = new UserProfile();
        userProfile.setBio(bio);
        userProfileRepository.save(userProfile);

        User user = new User();
        user.setName(name);
        user.setProfile(userProfile);

        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
}
