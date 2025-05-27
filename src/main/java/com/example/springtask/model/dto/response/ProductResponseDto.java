package com.example.springtask.model.dto.response;

import lombok.Data;

@Data
public class ProductResponseDto {
    private Long id;

    private String name;

    private String description;

    private double cost;
}
