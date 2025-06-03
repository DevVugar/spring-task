package com.example.springtask;

import com.example.springtask.config.ConfigurationClass;
import com.example.springtask.model.entity.Category;
import com.example.springtask.model.entity.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringTaskApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringTaskApplication.class, args);
ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Category brand1=context.getBean(Category.class);
        Category brand2=context.getBean(Category.class);

        Product product=context.getBean(Product.class);
        Product product2=context.getBean(Product.class);

        System.out.println("brand1"+brand1);
        System.out.println("brand2"+brand2);

        System.out.println(brand1.equals(brand2));

        System.out.println("product"+product);
        System.out.println("product2"+product2);

        System.out.println(product.equals(product2));







    }

}
