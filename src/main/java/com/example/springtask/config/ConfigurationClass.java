package com.example.springtask.config;

import com.example.springtask.model.entity.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.springtask.model.entity")
public class ConfigurationClass {

    @Bean
    @Scope("prototype")
    public Category getBrand(){
        return new Category();
    }
}
