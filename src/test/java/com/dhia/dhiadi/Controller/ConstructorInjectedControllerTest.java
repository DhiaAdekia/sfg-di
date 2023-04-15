package com.dhia.dhiadi.Controller;

import com.dhia.dhiadi.services.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller = new ConstructorInjectedController(new GreetingServiceConstructor());
    @BeforeEach
    void setUp() {

    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}