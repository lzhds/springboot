package com.example.springboot.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class testthread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        thread1 thread1 = new thread1();
        thread2 thread2 = new thread2();
        FutureTask<Integer> result1 = new FutureTask(thread1);
        FutureTask<Integer> result2 = new FutureTask(thread2);

        new Thread(result1).start();
        new Thread(result2).start();

        String s1 = String.valueOf(result1.get());
        String s2 = String.valueOf(result2.get());

        System.out.println(s1+"         "+s2);


        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Collection values = map.values();
        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            Integer integer=(Integer) iterator.next();
            System.out.println(integer);
        }



    }
}
