package com.yes2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("TrackCoach Class Started!! " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Track your free time :D";
    }
}
