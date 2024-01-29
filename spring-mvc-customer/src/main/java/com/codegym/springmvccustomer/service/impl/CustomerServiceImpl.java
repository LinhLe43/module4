package com.codegym.springmvccustomer.service.impl;

import com.codegym.springmvccustomer.model.Customer;
import com.codegym.springmvccustomer.service.CustomerService;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers;
    private static int autoIncreaseId = 0;

    static {
        customers = asList(
                new Customer(autoIncreaseId++, "Linh", "linh@gmail.com", "Nghia Tan"),
                new Customer(autoIncreaseId++, "Giang", "giang@gmail.com", "Nghia Tan"),
                new Customer(autoIncreaseId++, "Vanh", "vanh@gmail.com", "Dinh Thon"),
                new Customer(autoIncreaseId++, "Tom", "tom@gmail.com", "Dinh Thon"),
                new Customer(autoIncreaseId++, "Tien", "tien@gmail.com", "Dinh Thon")
        );
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
