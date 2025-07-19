package com.example.springtask.service;

import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto add(ProductRequestDto requestDto);

   List<ProductResponseDto> getAll();

    ProductResponseDto getById(Long id);

    void delete(Long id);

    ProductResponseDto getByName(String name);

    ProductResponseDto updateName(Long id,String name);

    ProductResponseDto updateName2(Long id, String name);
}
