package com.example.springboot.test;

import java.util.Scanner;

public class singleTest {
    static int i=1;
    public static void main(String[] args) {
        while(i<10){
            Scanner sc=new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println(i+10);
        }

    }
}
