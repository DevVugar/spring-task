package com.example.springtask.service;

import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;

public interface ProductService {
    ProductResponseDto add(ProductRequestDto requestDto);

    ProductResponseDto getById(Long id);

    void delete(Long id);
}
