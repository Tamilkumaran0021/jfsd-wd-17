package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");
//        FootballCoach coach = context.getBean("myFootballCoach", FootballCoach.class);
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getDailyWish());
//        System.out.println(coach.getEmail());
//        System.out.println(coach.getTeam());
//
//        context.close();


//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportsConfig.class);
//        FootballCoach coach1 = context.getBean("myFootballCoach", FootballCoach.class);
//        System.out.println(coach1.getDailyWorkout());
//        System.out.println(coach1.getDailyWish());
//        System.out.println(coach1.getTeam());
//
//        System.out.println(coach1);


        List<String> list = context.getBean("arrayList", List.class);
        System.out.println(list);
        context.close();
    }
}
