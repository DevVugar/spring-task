package com.example.springtask.model.dto.requset;

import lombok.Data;

@Data
public class CategoryRequestDto {
    private Long id;
    private String name;
    private String description;
    private Long categoryId;
}
