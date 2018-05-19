package com.tirq.springbootguru;

import com.tirq.springbootguru.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootGuruApplication {

    public static void main(String[] args) {
        var s = "hello from java 10...";
        System.out.println(s);
        ApplicationContext ctx = SpringApplication.run(SpringBootGuruApplication.class, args);
    }
}
