package com.dhia.dhiadi.Controller;

import com.dhia.dhiadi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("greetingServiceSetter")
    @Autowired
    public void set(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
