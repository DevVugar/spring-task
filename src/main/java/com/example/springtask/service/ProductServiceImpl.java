package com.example.springtask.service;

import com.example.springtask.enums.ProductStatus;
import com.example.springtask.mapper.ProductMapper;
import com.example.springtask.model.dto.requset.ProductRequestDto;
import com.example.springtask.model.dto.response.ProductResponseDto;
import com.example.springtask.model.entity.Product;
import com.example.springtask.repository.CategoryRepository;
import com.example.springtask.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryServiceImpl categoryService;
    private final List<ProductResponseDto> list = new ArrayList<>();


    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Product fetchProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product dont exist"));
    }

    @Override
    @Transactional
    public ProductResponseDto add(ProductRequestDto requestDto) {
        Product product = ProductMapper.PRODUCT_MAPPER.toEntity(requestDto);

        Product res = productRepository.save(product);
        calculate();

        return ProductMapper.PRODUCT_MAPPER.toResponse(res);
    }

    @Override
    public List<ProductResponseDto> getAll() {

        return productRepository.findAll().stream().map((e) ->
                        ProductMapper.PRODUCT_MAPPER.toResponse(e))
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponseDto getById(Long id) {

        Product product = fetchProduct(id);
        return ProductMapper.PRODUCT_MAPPER.toResponse(product);
    }

    @Override
    public void delete(Long id) {
        Product product = fetchProduct(id);
        product.setProductStatus(ProductStatus.DELETED);
        productRepository.save(product);
    }

    @Override
    public ProductResponseDto getByName(String name) {
        Product product = productRepository.getProductByName(name);
        return ProductMapper.PRODUCT_MAPPER.toResponse(product);
    }

    @Override
    @Transactional
    public ProductResponseDto updateName(Long id, String name) {
        Product product = productRepository.getProductById(id);
        product.setName(name);

        Product res = productRepository.save(product);

        categoryService.method();
        return ProductMapper.PRODUCT_MAPPER.toResponse(res);
    }


    @Override
    @Transactional
    public ProductResponseDto updateName2(Long id, String name) {
        Product product = productRepository.getProductById(id);
        product.setName(name);

        Product res = productRepository.save(product);

        categoryService.method2();
        return ProductMapper.PRODUCT_MAPPER.toResponse(res);
    }

    @Transactional
    public void method(){

        productRepository.save(Product.builder()
                .name("computer1000")
                .price(1000)
                .description("for office")
                .build());

        throw new RuntimeException();
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void calculate() {
        System.out.println("calculate");
    }


}
