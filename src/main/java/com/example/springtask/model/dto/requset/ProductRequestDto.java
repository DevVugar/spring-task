package com.example.springtask.model.dto.requset;


import lombok.Data;

@Data
public class ProductRequestDto {
    private Long id;

    private String name;

    private String description;

    private double cost;
}
