package com.practice.one;

public class DotaCoach
        implements Coach{

    private FortuneService fortuneService;

    public DotaCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Play some Dotes";
    }

    public String getDailyFortune(){
        return "Dota Coach: " + fortuneService.getFortune();
    }
}
