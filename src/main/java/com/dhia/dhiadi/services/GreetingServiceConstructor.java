package com.dhia.dhiadi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructor implements GreetingService {
    @Override
    public String sayGreeting(){
        return "hello from Constructor";
    }
}
