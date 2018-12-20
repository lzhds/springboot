package com.example.springboot.service;

import com.example.springboot.pojo.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
