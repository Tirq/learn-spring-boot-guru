package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloControllerSetter {


    GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayHello();
    }
}
