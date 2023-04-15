package com.dhia.dhiadi.Controller;

import com.dhia.dhiadi.services.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController = new SetterInjectedController();
    @BeforeEach
    void setUp() {
        setterInjectedController.set(new GreetingServiceConstructor());
    }

    @Test
    void sayGreeting() {
        System.out.println(setterInjectedController.sayGreeting());
    }
}