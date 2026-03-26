package ru.otus.java.basic;

import java.util.Arrays;

public class applications {
    public static void main(String[] args) {

        methodOne(10, "Привет");
        int[] arr = {3, 6, 3, 8, 7, 9, 6, 1, 5, 3, 1, 5};
        int[] myArr = new int[10];
        methodTwo(arr);
        methodThree(11, myArr);
        int[] myArre = {1, 5, 6, 2, 1, 3};
        methodFour(3, myArre);
        int[] myArrey = {5, 5, 5, 5, 1, 3, 2, 4, 5, 6};
        methodFive(myArrey);

    }

    public static void methodOne(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void methodTwo(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 5) {
                sum += a[i];

            }

        }
        System.out.println(sum);
    }

    public static void methodThree(int q, int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = q;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void methodFour(int z, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += z;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void methodFive(int[] arre) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arre.length / 2; i++) {
            sum1 += arre[i];

        }
        for (int b = arre.length / 2; b < arre.length; b++) {
            sum2 += arre[b];

        }
        if (sum1 > sum2) {
            System.out.println(sum1);
        } else System.out.println(sum2);

    }

}
