package com.example.productbe.service;

import com.example.productbe.model.Product;
import com.example.productbe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    void delete(Long id);
    Optional<Product> findById(Long id);
    List<Product> findByName(String name);
    List<Product> findByPriceBetween(double min, double max);
    List<Product> findByCategoryId(Long id);
}
