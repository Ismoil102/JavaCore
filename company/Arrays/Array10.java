package com.company.Arrays;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        for (int i = 0; i <n; i++)
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
    }
}