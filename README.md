# Springboot_Annotations

1. @SpringBootApplication Annotation

This annotation is used to mark the main class of a Spring Boot application. It encapsulates @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.
![image](https://github.com/JamboShambo/Springboot_Annotations/assets/47217057/0ee2adcf-4369-498f-a9ae-c20af161d872)


2. @SpringBootConfiguration Annotation

It is a class-level annotation that is part of the Spring Boot framework. It implies that a class provides Spring Boot application configuration. It can be used as an alternative to Spring’s standard @Configuration annotation so that configuration can be found automatically. Most Spring Boot Applications use @SpringBootConfiguration via @SpringBootApplication. If an application uses @SpringBootApplication, it is already using @SpringBootConfiguration.
