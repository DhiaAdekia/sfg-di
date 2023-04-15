package com.dhia.dhiadi.config;

import com.dhia.dhiadi.datasouce.FakeDataSource;
import com.dhia.dhiadi.repositories.EnglishGreetingRepository;
import com.dhia.dhiadi.repositories.EnglishGreetingRepositoryImpl;
import com.dhia.dhiadi.services.GreetingServiceProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingSpringConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${dhia.username}") String username,
                                  @Value("${dhia.password}") String password,
                                  @Value("${dhia.jdbc}") String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcrul(jdbcurl);
        return fakeDataSource;
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    GreetingServiceProperty greetingServiceProperty(EnglishGreetingRepository englishGreetingRepository){
        return new GreetingServiceProperty(englishGreetingRepository);
    }
}
