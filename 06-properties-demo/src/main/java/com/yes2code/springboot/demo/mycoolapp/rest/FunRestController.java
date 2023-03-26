package com.yes2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Adding the field and injecting the properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //creating the endpoint that will use the information from the application properties
    @GetMapping(("/teaminfo"))
    public String getTeamInfo() {
        return "Coach Name: " + coachName +"<br>Team Name: <i style = 'color : red'>" + teamName+"</i>";
    }

    //Expose "/" that will simply return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello Worlld!!";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "300 Push Ups!";
    }

    //expose a new endpoint for workout
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "No fortune for you, Bye!!";
    }
}
