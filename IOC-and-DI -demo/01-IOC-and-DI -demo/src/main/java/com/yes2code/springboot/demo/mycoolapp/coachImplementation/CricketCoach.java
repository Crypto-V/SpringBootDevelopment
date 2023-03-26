package com.yes2code.springboot.demo.mycoolapp.coachImplementation;

import com.yes2code.springboot.demo.mycoolapp.intefaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "<i style = 'color:red'>Run until you DIE! :)</i>";
    }


}
