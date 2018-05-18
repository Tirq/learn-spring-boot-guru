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

        //autowired by property
        var helloControllerProperty = (HelloControllerProperty) ctx.getBean("helloControllerProperty");
        helloControllerProperty.sayHello();

        //autowired by setter
        var helloControllerSetter = (HelloControllerSetter) ctx.getBean("helloControllerSetter");
        helloControllerSetter.sayHello();

        //autowired by constructor @autowired is opitional.
        var helloControllerConstructor = (HelloControllerConstructor) ctx.getBean("helloControllerConstructor");
        helloControllerConstructor.sayHello();

        //using @Qualifier to specify how implementation should be used.
        var helloControllerConstructorAndQualifier = (HelloControllerConstructorAndQualifier) ctx.getBean("helloControllerConstructorAndQualifier");
        helloControllerConstructorAndQualifier.sayHello();

        //using profile to choose whitc service use.
        var profileController = (ProfileController) ctx.getBean("profileController");
        profileController.showProfile();

    }
}
