package com.spring;

import org.springframework.stereotype.Component;

@Component
public class MotivationalWishService implements WishService {
    @Override
    public String getWish() {
        return "Practice more!!!!";
    }
}
