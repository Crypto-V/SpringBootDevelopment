package com.yes2code.springboot.demo.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach Class Started!! " + getClass().getSimpleName());
    }


    //define our init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("I am doing my startup stuff : "+getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doClanUpStuff(){
        System.out.println("I am doing my cleanUp stuff : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "<i style = 'color:red'>Run fast until you DIE! :)</i>";
    }


}
