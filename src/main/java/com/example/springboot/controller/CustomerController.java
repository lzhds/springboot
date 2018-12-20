package com.example.springboot.controller;

import com.example.springboot.dao.CustomerDao;
import com.example.springboot.pojo.Customer;
import com.example.springboot.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class CustomerController {


    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/listCustomer")
    public String listCustomer(Model model){
        List<Customer> customer=customerService.findAll();
        model.addAttribute("customer",customer);
        return "hello";
    }

    @RequestMapping(value = "/aaa")
    @ResponseBody
    public String aaa(){
        return "dsdashdh";
    }


    @RequestMapping(value = "qqq")
    @ResponseBody
    public Customer qqq(){
        Customer c=new Customer();
        c.setId(1);
        c.setCustomer_name("马云");
        c.setCustomer_email("123456@qq.com");
        return c;
    }

    @Test
    public void js() throws IOException {
        InputStream in1 = this.getClass().getClassLoader().getResourceAsStream("config.properties");
        Properties p = new Properties();
        p.load(in1);
        String id=p.getProperty("id");
        String name=p.getProperty("name");
        System.out.println(id+"     "+name);

    }



}

