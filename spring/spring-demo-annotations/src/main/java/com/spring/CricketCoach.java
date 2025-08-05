package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myCricketCoach")
public class CricketCoach implements Coach {

    private WishService wishService;

    @Autowired
    public CricketCoach(@Qualifier("myWish") WishService wishService) {
        this.wishService = wishService;
    }

    public String getDailyWorkout() {
        return "Spend 30 mins batting practice";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }

}
