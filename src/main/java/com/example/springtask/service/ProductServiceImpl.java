package com.example.springtask.service;

import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {



    @Override
    public ProductResponseDto add(ProductRequestDto requestDto) {
        return null;
    }

    @Override
    public ProductResponseDto getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
