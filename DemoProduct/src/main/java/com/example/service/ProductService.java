package com.example.service;

import com.example.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    void delete(Long id);

    Optional<Product> findById(Long id);
}
