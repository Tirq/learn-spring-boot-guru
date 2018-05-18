package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloControllerConstructor {

    GreetingService greetingService;

    public HelloControllerConstructor(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayHello();
    }
}
