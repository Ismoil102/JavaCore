package com.company.Arrays;

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        int i;
        for (i=0; i<n; i++)
            arr[i]=sc.nextDouble();
            for (i = arr.length - 1; i >= 0; i-=2)
                System.out.println(arr[i]);

    }
}
