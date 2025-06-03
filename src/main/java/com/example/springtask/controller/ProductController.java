package com.example.springtask.controller;


import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import com.example.springtask.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")

public class ProductController {

    //    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<ProductResponseDto> add(@RequestBody ProductRequestDto requestDto) {
        return new ResponseEntity<>(productService.add(requestDto), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    ResponseEntity<ProductResponseDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(productService.getById(id), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<List<ProductResponseDto>> getAll() {
        return new ResponseEntity<(productService.getAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/id")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
