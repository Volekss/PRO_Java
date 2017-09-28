package com.company;

import java.util.Arrays;

public class Task1 implements Runnable {
    int[] a, b, c, d;
    int[][] md, me;
    Thread t;
    Data data;

    public Task1(Data data){
        t = new Thread(this);
        this.data = data;
        t.start();
    }
    @Override
    public void run() {
        System.out.println("Task1 has been started...");

        int n = data.getN();

        b = new int[n];
        Arrays.fill(b, 1);
        c = new int[n];
        Arrays.fill(c, 1);
        d = new int[n];
        Arrays.fill(d, 1);
        md = new int[n][n];
        me = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(md[i], 1);
            Arrays.fill(me[i], 1);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a = data.f1(b, c, d, md, me);
        if (n<=10){
            System.out.println("F1:");
            System.out.println(Arrays.toString(a));
        }

        System.out.println("Task1 has been finished...");
    }
}
