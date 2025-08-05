package com.spring;

public class FootballCoach implements Coach {

    private WishService wishService;
    private String email;
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setWishService(WishService wishService) {
        this.wishService = wishService;
    }

    public WishService getWishService() {
        return wishService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDailyWorkout() {
        return "Spend 30 mins kicking practice";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }

    public void startupMethod() {
        System.out.println("started");
    }

    public void destroyMethod() {
        System.out.println("destroyed");
    }
}
