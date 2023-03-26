package com.yes2code.springboot.demo.mycoolapp.rest;

import com.yes2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachDemoRestController {
    //Define private field for the DI
    private final Coach myCoach;
    private final Coach anotherCoach;

    @Autowired
    public CoachDemoRestController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In Rest Constructor - >> " + getClass().getSimpleName());
        this.myCoach = theCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach and anotherCoach, "+ (myCoach == anotherCoach);
    }
}
