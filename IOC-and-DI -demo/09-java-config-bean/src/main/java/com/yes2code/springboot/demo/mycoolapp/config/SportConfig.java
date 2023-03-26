package com.yes2code.springboot.demo.mycoolapp.config;
//This will class will be configured using java configuration.

import com.yes2code.springboot.demo.mycoolapp.common.Coach;
import com.yes2code.springboot.demo.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //We dont have acces to the third party source code so we cant mark it as component so we use
    // @Bean is used to integrate any third party component into the project and use it as a component.
    // We are explicitly creating the bean, as u can see swimCoach first letter is small which
    // correspond to bean naming conventions.
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
