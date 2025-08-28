package com.example.demo_spring_batch.service;

import com.example.demo_spring_batch.entity.Profile;
import com.example.demo_spring_batch.entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

@Service
public class ProfileItemProcessor implements ItemProcessor<User, Profile> {
    @Override
    public Profile process(User user) throws Exception {

        Profile profile = new Profile();
        profile.setUserId(user.getId());
        profile.setFullName(user.getFirstName() + " " + user.getLastName());

        return profile;
    }
}
