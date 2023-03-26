package com.yes2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("Baseball Class Started!! " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Throw some Balls!";
    }
}
