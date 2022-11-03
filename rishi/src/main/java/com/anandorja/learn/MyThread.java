package com.anandorja.learn;

class RunnableDemo implements Runnable {
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    @Override
    synchronized public void run() {
        System.out.println("Running " +  threadName );

        try {
            for(int i = 1; i < 6; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
}

class ThreadDemo extends Thread {
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    @Override
    synchronized public void run() {
        System.out.println("Running " +  threadName );

        try {
            for(int i = 1; i < 6; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
}


public class MyThread {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        Thread t = new Thread(R1);
        t.start();

        /**RunnableDemo R2 = new RunnableDemo("Thread-2");
        Thread t1 = new Thread(R2);
        t1.start();*/

        ThreadDemo T1 = new ThreadDemo("Thread-2");
        T1.start();
    }
}
