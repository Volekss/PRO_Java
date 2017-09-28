package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 3000;
        Data data = new Data(n);
        //Task1 implements Runnable
        Task1 t1 = new Task1(data);
        t1.t.setPriority(Thread.MAX_PRIORITY);
        //Task2 extends Thread
        Task2 t2 = new Task2(data);
        t2.setPriority(6);
        //Task3 extends Thread
        Task3 t3 = new Task3(data);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.start();
        try {
            t1.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lab 2 is finished");

    }
}
