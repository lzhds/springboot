package com.example.springboot.controller;

import static java.lang.Thread.sleep;

public class thread3 implements Runnable {

    @Override
    public void run() {
        System.out.println("1321313454");
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
