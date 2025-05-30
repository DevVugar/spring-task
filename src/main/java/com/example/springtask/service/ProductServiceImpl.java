package com.example.springtask.service;

import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ProductServiceImpl implements ProductService {



    @Override
    public ProductResponseDto add(ProductRequestDto requestDto) {
        log.info("add product");
        return null;
    }

    @Override
    public ProductResponseDto getById(Long id) {
        log.info("getById product");
        return null;
    }

    @Override
    public void delete(Long id) {
        log.info("deleteN  product");
    }
}
