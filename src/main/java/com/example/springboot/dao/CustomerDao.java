package com.example.springboot.dao;

import com.example.springboot.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerDao {

    List<Customer> findAll();
}
