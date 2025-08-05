package com.spring;

public class CricketCoach implements Coach {

    private WishService wishService;

    public CricketCoach(WishService wishService) {
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
