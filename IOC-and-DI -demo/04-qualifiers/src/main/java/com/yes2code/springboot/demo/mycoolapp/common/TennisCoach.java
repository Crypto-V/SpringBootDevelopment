package com.yes2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "You are bad in Tennis!! Give Up!";
    }
}
