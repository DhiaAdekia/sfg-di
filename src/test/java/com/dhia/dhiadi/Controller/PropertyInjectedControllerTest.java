package com.dhia.dhiadi.Controller;

import com.dhia.dhiadi.services.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceConstructor();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}