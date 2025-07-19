package com.example.springtask.repository;

import com.example.springtask.model.entity.Product;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product getProductByName(String name);
    Product getProductById(Long id);

}
