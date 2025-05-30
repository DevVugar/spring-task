package com.example.springtask.model.entity;


import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@EqualsAndHashCode
public class Product {

    private Long id;

    private String name;

    private String description;

    private double cost;

    private long stock;



}
