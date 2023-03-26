package com.yes2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("TennisCoach Class Started!! " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "You are bad in Tennis!! Give Up!";
    }
}
