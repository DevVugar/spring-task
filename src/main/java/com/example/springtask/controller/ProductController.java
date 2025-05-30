package com.example.springtask.controller;


import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import com.example.springtask.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")

public class ProductController {

//    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ProductResponseDto add(@RequestBody ProductRequestDto requestDto) {
        return productService.add(requestDto);
    }

    @GetMapping("/get/{id}")
    ProductResponseDto getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping("/delete/id")
    void delete(@PathVariable Long id) {
        productService.delete(id);
    }


}
