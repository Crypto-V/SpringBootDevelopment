package com.yes2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Primary is used to point that if there is no explicid declaration of which bean should be used
// then will take this as default.
@Component
@Primary
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Track your free time :D";
    }
}
