package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import com.example.springtask.model.entity.Product;

public enum ProductMapper {

 PRODUCT_MAPPER;

 public Product toEntity(ProductRequestDto requestDto){
     return Product.builder()
                     .id(requestDto.getId())
                             .name(requestDto.getName())
                                     .description(requestDto.getDescription())
                                             .price(requestDto.getPrice()).build();
 }

    public ProductResponseDto toResponse(Product product){
        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice()).build();
    }

}
