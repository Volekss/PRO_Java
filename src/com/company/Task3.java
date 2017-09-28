package com.company;

import java.util.Arrays;

public class Task3 extends  Thread {
    Data data;
    int t;
    int[] r, s;
    int[][] mo, mp, ms;

    public Task3(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Task3 has been started...");
        int n = data.getN();
        r = new int[n];
        Arrays.fill(r, 1);
        s = new int[n];
        Arrays.fill(s, 1);

        mo = new int[n][n];
        mp = new int[n][n];
        ms = new int[n][n];


        for (int i = 0; i < n; i++) {
            Arrays.fill(mo[i], 1);
            Arrays.fill(mp[i], 1);
            Arrays.fill(ms[i], 1);
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int t = data.f3(r, s, mo, mp, ms);

        if (n<=10){
            System.out.println("F3:");
            System.out.println(t);
        }

        System.out.println("Task3 has been finished...");
    }
}
