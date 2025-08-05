package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myFootballCoach")
//@Scope("prototype")
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("motivationalWishService")
    private WishService wishService;
    private String email;
    @Value("${foo.team}")
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    //@Autowired
    public void setWishService(@Qualifier("motivationalWishService") WishService wishService) {
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

    @PostConstruct
    public void startupMethod() {
        System.out.println("started");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroyed");
    }
}
