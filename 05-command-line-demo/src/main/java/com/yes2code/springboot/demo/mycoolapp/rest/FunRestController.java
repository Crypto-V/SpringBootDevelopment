package com.yes2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
