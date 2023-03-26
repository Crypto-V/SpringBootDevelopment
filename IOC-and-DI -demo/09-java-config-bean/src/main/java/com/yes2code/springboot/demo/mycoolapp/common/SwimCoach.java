package com.yes2code.springboot.demo.mycoolapp.common;


public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("SwimCoach Class Started!! " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 300 yeards!!";
    }
}
