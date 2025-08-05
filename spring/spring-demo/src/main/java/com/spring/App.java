package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        CricketCoach coach = new CricketCoach();
//        FootballCoach coach = new FootballCoach();
//
//        Coach coach = new CricketCoach(new HappyWishService());
//        FootballCoach coach = new FootballCoach();
//        coach.setWishService(new HappyWishService());
//
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getDailyWish());


//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");
//        FootballCoach coach = context.getBean("myFootballCoach", FootballCoach.class);
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getDailyWish());
//        System.out.println(coach.getEmail());
//        System.out.println(coach.getTeam());
//
//        context.close();


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        FootballCoach coach1 = context.getBean("myFootballCoach", FootballCoach.class);
//        FootballCoach coach2 = context.getBean("myFootballCoach", FootballCoach.class);


        System.out.println(coach1);
//        System.out.println(coach2);

        context.close();
    }
}
