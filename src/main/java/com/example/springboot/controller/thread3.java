package com.example.springboot.controller;

import static java.lang.Thread.sleep;

public class thread3 implements Runnable {

    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
