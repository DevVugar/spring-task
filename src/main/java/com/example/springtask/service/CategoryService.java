package com.example.springtask.service;

import com.example.springtask.model.dto.requset.CategoryRequestDto;
import com.example.springtask.model.dto.response.CategoryResponseDto;

import java.util.List;

public interface CategoryService {
    CategoryResponseDto add(CategoryRequestDto category);
    CategoryResponseDto getById(Long id);
    CategoryResponseDto update(CategoryRequestDto category);
    void delete(Long id);
    List<CategoryResponseDto> getAll();
}
