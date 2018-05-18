package com.tirq.springbootguru.service;

import org.springframework.stereotype.Service;

@Service
public class HardGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello from hard!");
    }
}
