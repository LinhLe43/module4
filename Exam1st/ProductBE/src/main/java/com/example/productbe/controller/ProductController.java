package com.example.productbe.controller;

import com.example.productbe.model.Product;
import com.example.productbe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> showAll() {
        List<Product> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity<>("Thêm Thành Công", HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productService.save(product);
        return new ResponseEntity<>("Sửa Thành Công", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity<>("Xóa Thành Công", HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> showByName(@RequestParam String name) {
        List<Product> products = productService.findByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/price")
    public ResponseEntity<List<Product>> showByPrice(@RequestParam double min, @RequestParam double max) {
        List<Product> products = productService.findByPriceBetween(min, max);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> showByCategory(@PathVariable Long id) {
        List<Product> products = productService.findByCategoryId(id);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
