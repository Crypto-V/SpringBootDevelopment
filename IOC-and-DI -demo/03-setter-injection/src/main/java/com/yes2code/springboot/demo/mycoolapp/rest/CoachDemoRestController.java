package com.yes2code.springboot.demo.mycoolapp.rest;

import com.yes2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachDemoRestController {
    //Define private field ffor the DI
    private Coach myCoach;

    //setter injection, in the background spring will create the instance of a cricket coach and will inject the dependency
    //method don't necessary have to be setter it can be any method with any name as soon as
    //you mark it with autowired Spring will know that is a dependency for bean creation.
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
