package org.springframework.debug.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="org.springframework.debug.aop.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration { }