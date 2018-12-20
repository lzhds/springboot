package com.example.springboot.controller;

import java.util.concurrent.Callable;

public class thread2 implements Callable {

    @Override
    public Object call() throws Exception {
        String sum2="qwed";

        return sum2;
    }
}
