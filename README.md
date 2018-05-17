# learn-spring-boot-guru
This source is based at the course of springframework.guru using _Java 10_ and _Gradle_ !


## Branch 1-add-entities

In this branch, it was added new models (entities): _Author_, _Book_ and _Publisher_, also it was created one class named IdEntity who has the _Id_ attribute, its assessors and the implementation to _equals and hashcode_.

It was created in three repositories to manipulate data to the models previously created.
How I'm using H2 as the database (in memory ), I created a bootstrap class to populate data when the application is starting.  

Finally, to get access from the H2 database console, it was put ```spring.h2.console.enabled=true``` in the configurations.

## Branch 2-mvc-controllers

In this branch, it was added to the first steps using Thymeleaf to create the first HTML pages: _books_ and _authors_. To manage this pages, it was created the controllers named _BookController_ and _AuthorController_. The controllers are classes annotated with ```@Controller``` and each controller has a method annotated with ```@RequestMapping``` where is specified the name of the action called by request. These methods populate attributes who are sent to in the HTML pages.