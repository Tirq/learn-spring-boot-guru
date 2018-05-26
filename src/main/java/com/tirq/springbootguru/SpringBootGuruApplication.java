package com.tirq.springbootguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGuruApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        var s = "hello from java 10...";
        System.out.println(s);
        SpringApplication.run(SpringBootGuruApplication.class, args);
    }
}
