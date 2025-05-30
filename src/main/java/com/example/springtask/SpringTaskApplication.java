package com.example.springtask;

import com.example.springtask.config.ConfigurationClass;
import com.example.springtask.model.entity.Brand;
import com.example.springtask.model.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.module.Configuration;

@SpringBootApplication
public class SpringTaskApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringTaskApplication.class, args);
ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Brand brand1=context.getBean(Brand.class);
        Brand brand2=context.getBean(Brand.class);

        Product product=context.getBean(Product.class);
        Product product2=context.getBean(Product.class);

        System.out.println("brand1"+brand1);
        System.out.println("brand2"+brand2);

        System.out.println("product"+product);
        System.out.println("product2"+product2);







    }

}
