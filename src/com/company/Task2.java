package com.company;

import java.util.Arrays;

public class Task2 extends Thread {
    Data data;
    int[][] ml, mf, mg, mh, mk;

    public Task2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Task2 has been started...");

        int n = data.getN();
        mf = new int[n][n];
        mg = new int[n][n];
        mh = new int[n][n];
        mk = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(mf[i], 1);
            Arrays.fill(mg[i], 1);
            Arrays.fill(mh[i], 1);
            Arrays.fill(mk[i], 1);
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ml = data.f2(mf, mg, mh, mk);
        if (n <= 10) {
            System.out.println("F2:");
            int rows = ml.length;
            int columns = ml[0].length;
            String str = "|\t";

            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    str += ml[i][j] + "\t";
                }

                System.out.println(str + "|");
                str = "|\t";
            }
        }

        System.out.println("Task2 has been finished...");
    }
}
