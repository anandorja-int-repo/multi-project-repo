package com.anandorja.learn.Bharath;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();

        LinkedList lis = new LinkedList();
        System.out.println("before"+dtf.format(localTime)  );
        final long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for(int i=1;i<=1000;i++){
            lis.add(i);
            System.out.println("the number is " + i);
        }
        System.out.println("after "+dtf.format(localTime) );

        final long endtime = System.currentTimeMillis();
        System.out.println(endtime);
        System.out.println("Total execution time: " + (endtime - startTime));
    }

}
