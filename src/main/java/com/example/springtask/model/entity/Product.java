package com.example.springtask.model.entity;


import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    private Long id;

    private String name;

    private String description;

    private double cost;

    private long stock;



}
