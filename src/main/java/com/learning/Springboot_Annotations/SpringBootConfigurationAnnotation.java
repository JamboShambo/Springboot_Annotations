package com.learning.Springboot_Annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class SpringBootConfigurationAnnotation {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigurationAnnotation.class, args);
    }

    // USED FOR DEMONSTRATION of @SpringBootConfiguration ONLY
//    @Bean
//    public StudentService studentService() {
//        return new StudentServiceImpl();
//    }
}
