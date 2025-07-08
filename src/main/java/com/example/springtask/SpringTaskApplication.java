package com.example.springtask;

import com.example.springtask.config.ConfigurationClass;
import com.example.springtask.model.entity.Category;
import com.example.springtask.model.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringTaskApplication {

    public static void main(String[] args) {
            SpringApplication.run(SpringTaskApplication.class, args);
    }
}
