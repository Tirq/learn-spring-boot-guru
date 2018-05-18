package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloControllerConstructorAndQualifier {

    GreetingService greetingService;

    public HelloControllerConstructorAndQualifier(@Qualifier("hardGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayHello();
    }
}
