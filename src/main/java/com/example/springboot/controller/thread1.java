package com.example.springboot.controller;

import java.util.concurrent.Callable;

public class thread1 implements Callable {


    @Override
    public Object call() throws Exception {
        String sum1="asd";

        return sum1;
    }
}
