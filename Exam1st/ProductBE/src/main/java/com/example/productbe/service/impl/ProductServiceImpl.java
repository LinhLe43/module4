package com.example.productbe.service.impl;

import com.example.productbe.model.Product;
import com.example.productbe.repository.ProductRepository;
import com.example.productbe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findAllByNameContaining(name);
    }

    @Override
    public List<Product> findByPriceBetween(double min, double max) {
        return productRepository.findAllByPriceBetween(min, max);
    }

    @Override
    public List<Product> findByCategoryId(Long id) {
        return productRepository.findAllByCategoryId(id);
    }
}
