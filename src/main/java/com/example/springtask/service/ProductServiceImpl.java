package com.example.springtask.service;

import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final List<ProductResponseDto> list = new ArrayList<>();

    @Override
    public ProductResponseDto add(ProductRequestDto requestDto) {
        log.info("add product");

        // Convert request to response
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setId(requestDto.getId());
        responseDto.setName(requestDto.getName());


        list.add(responseDto);
        return responseDto;
    }

    @Override
    public List<ProductResponseDto> getAll() {
        log.info("get all products");
        return list;
    }

    @Override
    public ProductResponseDto getById(Long id) {
        log.info("getById product");

        for (ProductResponseDto product : list) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        log.info("delete product");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public ProductResponseDto getByName(String name) {
        log.info("getByName product");

        for (ProductResponseDto product : list) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
