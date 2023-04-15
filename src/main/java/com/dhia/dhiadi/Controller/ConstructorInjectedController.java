package com.dhia.dhiadi.Controller;

import com.dhia.dhiadi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceConstructor") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
