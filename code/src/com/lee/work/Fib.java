package com.lee.work;

import java.math.BigInteger;

public class Fib {
    public static void main(String[] args) {
        int cols = 10;
        int rows = 10;
        BigInteger arr[] = new BigInteger[cols];
        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;

        for (int j = 0; j < rows; j++) {
            for (int i = 2; i < cols; i++) {
                arr[i] = arr[i - 1].add(arr[i - 2]);
                System.out.print(arr[i] + "\t");
            }
            arr[0] = arr[cols - 2].add(arr[cols - 1]);
            arr[1] = arr[cols - 1].add(arr[0]);
            System.out.print(arr[0] + "\t");
            System.out.print(arr[1] + "\t\n");
        }

    }

}
