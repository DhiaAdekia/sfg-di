package com.dhia.dhiadi.Controller;

import com.dhia.dhiadi.services.GreetingService;
import com.dhia.dhiadi.services.GreetingServiceProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void functionToPrint(){
        System.out.println("this is my controller");
    }
}
