# Springboot_Annotations

1. @SpringBootApplication Annotation

This annotation is used to mark the main class of a Spring Boot application. It encapsulates @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.
![image](https://github.com/JamboShambo/Springboot_Annotations/assets/47217057/0ee2adcf-4369-498f-a9ae-c20af161d872)


2. @SpringBootConfiguration Annotation

It is a class-level annotation that is part of the Spring Boot framework. It implies that a class provides Spring Boot application configuration. It can be used as an alternative to Spring’s standard @Configuration annotation so that configuration can be found automatically. Most Spring Boot Applications use @SpringBootConfiguration via @SpringBootApplication. If an application uses @SpringBootApplication, it is already using @SpringBootConfiguration.


3. @EnableAutoConfiguration Annotation

This annotation auto-configures the beans that are present in the classpath. It simplifies the developer’s work by assuming the required beans from the classpath and configure it to run the application. This annotation is part of the spring boot framework. For example, when we illustrate the spring-boot-starter-web dependency in the classpath, Spring boot auto-configures Tomcat, and Spring MVC. The package of the class declaring the @EnableAutoConfiguration annotation is considered as the default. Therefore, we need to apply the @EnableAutoConfiguration annotation in the root package so that every sub-packages and class can be examined.
