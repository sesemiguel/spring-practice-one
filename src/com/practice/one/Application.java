package com.practice.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach dotaCoach = classPathXmlApplicationContext.getBean("dotaCoach", DotaCoach.class);

        System.out.println("Daily Workout: " + dotaCoach.getDailyWorkout());
        System.out.println("Daily Fortune: " + dotaCoach.getDailyFortune());
    }
}
