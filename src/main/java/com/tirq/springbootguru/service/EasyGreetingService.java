package com.tirq.springbootguru.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EasyGreetingService implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello from easy!");
    }
}
