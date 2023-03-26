package com.yes2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach Class Started!! " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "<i style = 'color:red'>Run fast until you DIE! :)</i>";
    }


}
