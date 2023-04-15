package com.dhia.dhiadi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ProtypeBean {
    public ProtypeBean(){
        System.out.println("Creating a Protoype Bean !!!!!!!!!");
    }
    public String getMyScope(){
        return "I am a prototype";
    }
}
