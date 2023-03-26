package com.yes2code.springboot.demo.mycoolapp.rest;

import com.yes2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachDemoRestController {
    //Define private field ffor the DI
    private Coach myCoach;

    @Autowired
    public CoachDemoRestController(@Qualifier("cricketCoach") Coach theCoach) {
        System.out.println("In Rest Constructor - >> " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
