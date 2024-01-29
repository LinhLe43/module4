package com.codegym.springmvccustomer.controller;

import com.codegym.springmvccustomer.model.Customer;
import com.codegym.springmvccustomer.service.CustomerService;
import com.codegym.springmvccustomer.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
