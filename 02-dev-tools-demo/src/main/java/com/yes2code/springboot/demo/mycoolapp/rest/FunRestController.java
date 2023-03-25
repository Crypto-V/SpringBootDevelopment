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
}
