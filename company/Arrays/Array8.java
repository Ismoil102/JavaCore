package com.company.Arrays;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        int i;
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for ( i = 0; i < n; i++)
            if (arr[i] % 2 != 0){
                k++;
                System.out.println("index:" + i + " arr[" + i + "]=" + arr[i]);}

            System.out.println("k=" + k);



    }
}