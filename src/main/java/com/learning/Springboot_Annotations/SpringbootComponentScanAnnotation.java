package com.learning.Springboot_Annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

// Main class
public class SpringbootComponentScanAnnotation {

    // Main driver method
    public static void main(String[] args)
    {

        SpringApplication.run(SpringbootComponentScanAnnotation.class, args);
    }
}
