package com.company;

import java.util.Scanner;

public class Data {
    private int n;

    public int getN() {
        return n;
    }

    public Data(int n) {
        this.n = n;
    }

    public int[] vectorInput() {
        int[] vector = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }
        return vector;
    }

    public int[][] matrixInput() {
        int[][] matrix = new int[n][n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public int[] add(int[] aVector, int[] bVector) {
        int[] rVector = new int[n];
        for (int i = 0; i < n; i++) {
            rVector[i] = aVector[i] + bVector[i];
        }
        return rVector;
    }

    public int[][] add(int[][] aMatrix, int[][] bMatrix) {
        int[][] rMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rMatrix[i][j] = aMatrix[i][j] + bMatrix[i][j];
            }
        }
        return rMatrix;
    }

    public int[] multiply(int[][] aMatrix, int[] aVector) {
        int[] rVector = new int[n];

        for (int i = 0; i < n; i++) {
            rVector[i] = 0;
            for (int j = 0; j < n; j++) {
                rVector[i] = rVector[i] + aMatrix[i][j] * aVector[i];
            }
        }
        return rVector;
    }

    public int[][] multiply(int[][] aMatrix, int[][] bMatrix) {
        int[][] rMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rMatrix[i][j] = 0;

                for (int k = 0; k < n; k++) {
                    rMatrix[i][j] = rMatrix[i][j] + aMatrix[i][j] * bMatrix[k][j];
                }
            }
        }
        return rMatrix;
    }

    public int[][] multiply(int[][] aMatrix, int a) {
        int[][] rMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rMatrix[i][j] = aMatrix[i][j] * a;
            }
        }
        return rMatrix;
    }

    public int maxOfMatrix(int[][] aMatrix) {
        int r = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r < aMatrix[i][j])
                    r = aMatrix[i][j];
            }
        }
        return r;
    }

    public int minOfMatrix(int[][] aMatrix) {
        int r = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r > aMatrix[i][j])
                    r = aMatrix[i][j];
            }
        }
        return r;
    }

    public int maxOfVector(int[] aMatrix) {
        int r = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (r < aMatrix[i])
                r = aMatrix[i];
        }
        return r;
    }

    public int[][] transMatrix(int[][] rMatrix) {
        int t;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                t = rMatrix[i][j];
                rMatrix[i][j] = rMatrix[j][i];
                rMatrix[j][i] = t;
            }
        }
        return rMatrix;
    }

    //1.12
    public int[] f1(int[] bVector, int[] cVector, int[] dVector, int[][] dMatrix, int[][] eMatrix) {
        return add(add(bVector, cVector), multiply(multiply(dMatrix, eMatrix), dVector));
    }

    //2.13
    public int[][] f2(int[][] fMatrix, int[][] gMatrix, int[][] hMatrix, int[][] kMatrix) {
        return add(multiply(gMatrix, minOfMatrix(fMatrix)), multiply(multiply(kMatrix, fMatrix), maxOfMatrix(hMatrix)));
    }

    //3.16
    public int f3(int[] rVector, int[] sVector, int[][] oMatrix, int[][] pMatrix, int[][] sMatrix) {
        return maxOfVector(add(multiply(multiply(oMatrix, pMatrix), rVector), multiply(sMatrix, sVector)));
    }

}
