package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloControllerProperty {

    @Autowired
    GreetingService greetingService;

    public void sayHello(){
        greetingService.sayHello();
    }
}
