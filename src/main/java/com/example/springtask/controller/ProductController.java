package com.example.springtask.controller;


import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import com.example.springtask.model.entity.Product;
import com.example.springtask.repository.ProductRepository;
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

    private final ProductService productService;
    private final ProductRepository productRepository;

    public ProductController(ProductService productService,
                             ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }




    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductResponseDto> add(@RequestBody ProductRequestDto requestDto) {
        return new ResponseEntity<>(productService.add(requestDto), HttpStatus.CREATED);
    }

    @GetMapping("/get-name")
    ResponseEntity<ProductResponseDto> getByName(@RequestParam String name) {
        return new ResponseEntity<>(productService.getByName(name), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    ResponseEntity<ProductResponseDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(productService.getById(id), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<List<ProductResponseDto>> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}/updateName")
    ResponseEntity<ProductResponseDto> updateName(@PathVariable Long id, @RequestParam String name) {
        return new ResponseEntity<>(productService.updateName(id,name), HttpStatus.OK);
    }

    @PutMapping("/{id}/updateName2")
    ResponseEntity<ProductResponseDto> updateName2(@PathVariable Long id, @RequestParam String name) {
        return new ResponseEntity<>(productService.updateName2(id,name), HttpStatus.OK);
    }


}
