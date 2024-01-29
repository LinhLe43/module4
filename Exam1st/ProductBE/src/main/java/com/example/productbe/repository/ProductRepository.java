package com.example.productbe.repository;

import com.example.productbe.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameContaining(String name);

    List<Product> findAllByPriceBetween(double minPrice, double maxPrice);

    List<Product> findAllByCategoryId(Long id);
}