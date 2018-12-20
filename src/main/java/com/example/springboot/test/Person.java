package com.example.springboot.test;


import java.sql.Date;

class Person{
    static int i=1;

    public static void main(String[] args) {
        while(i<5){
            System.out.println(Thread.currentThread().getName());
            i++;
        }


    }

}