package com.dhia.dhiadi.services;

import com.dhia.dhiadi.repositories.EnglishGreetingRepository;
import org.springframework.stereotype.Service;


public class GreetingServiceProperty implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public GreetingServiceProperty(EnglishGreetingRepository englishGreetingRepository){
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "hello from Property";
    }
}
