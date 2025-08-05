package com.spring;

import org.springframework.stereotype.Component;

@Component("myWish")
public class HappyWishService implements WishService {
    @Override
    public String getWish() {
        return "Good luck for the match";
    }
}
