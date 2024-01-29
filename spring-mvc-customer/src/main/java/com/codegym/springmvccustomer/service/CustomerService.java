package com.codegym.springmvccustomer.service;

import com.codegym.springmvccustomer.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
