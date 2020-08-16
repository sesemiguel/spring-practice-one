package com.practice.one;

import java.util.Random;

public class HappyFortuneService
        implements FortuneService{

    private final String[] fortunes = {"Fortune 1", "Fortune 2", "Fortune 3"};

    public String getFortune() {
        Random random = new Random();
        int max = fortunes.length - 1;
        int min = 0;
        int randomNum = random.nextInt((max - min) + 1) + min;
        return fortunes[randomNum];
    }
}
