package org.springframework.debug.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("org.springframework.debug")
public class MyComponentScan {

    @ComponentScan("org.springframework.debug")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
