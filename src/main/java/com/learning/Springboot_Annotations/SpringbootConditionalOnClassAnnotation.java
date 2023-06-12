package com.learning.Springboot_Annotations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MongoDBService.class) // Comment out to allow build

class SpringbootConditionalOnClassAnnotation {
    // Insert code here
}
