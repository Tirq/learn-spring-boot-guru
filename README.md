# learn-spring-boot-guru
This source is based at the course of springframework.guru using _Java 10_ and _Gradle_ !
## Branch 1-add-entities
In this branch, it was added new models (entities): _Author_, _Book_ and _Publisher_, also it was created one class named IdEntity who has the _Id_ attribute, its assessors and the implementation to _equals and hashcode_.

It was created in three repositories to manipulate data to the models previously created.
How I'm using H2 as the database (in memory ), I created a bootstrap class to populate data when the application is starting.  

Finally, to get access from the H2 database console, it was put ```spring.h2.console.enabled=true``` in the configurations.
## Branch 2-mvc-controllers
In this branch, it was added to the first steps using Thymeleaf to create the first HTML pages: _books_ and _authors_. To manage this pages, it was created the controllers named _BookController_ and _AuthorController_. The controllers are classes annotated with ```@Controller``` and each controller has a method annotated with ```@RequestMapping``` where is specified the name of the action called by request. These methods populate attributes who are sent to in the HTML pages.
## Branch 3-dependency-injection
In this branch, it was added some examples of how to use DI (Dependency Injection). It was shown three ways to do this:
* ```HelloControllerProperty```: using the annotation ```@Autowired``` on the property. 
* ```HelloControllerSetter```: using the annotation ```@Autowired```  in the setter.
* ```HelloControllerConstructor```: the annotation ```@Autowired``` is optional if the constructor is used. **It is the recommended way**.

All the controller are annotated with ```@Controller```, where each controller has a ```@Service``` property and both annotations come from ```@Component```.
These three first controllers are using the ```EasyGreetingService``` because it's annotated with ```
@Primary```. 

The fourth called it was to ```HelloControllerConstructorAndQualifier```, this controller is using the ```@Qualifier("hardGreetingService")``` to say what implementation should be used, different from the others controllers previously created.

Then I have created a controller called ```ProfileController``` to show how the annotation ```@Profile``` can read the _application.properties_ and choose a specific service. The default word was used if the properties doen't specify what profile to use. 
## Branch 4-jokes-app
In this branch, it was added a sample controller to print a random quote when the joke we page is visited.
## Branch 5-spring-config
In this branch, it was added a type of spring conguration using annotation in the _ChuckNorrisConfig_ class. 
## Branch 6-spring-config-xml
In this branch, it was added a type of spring conguration using xml in the _chuck-config_ file.
