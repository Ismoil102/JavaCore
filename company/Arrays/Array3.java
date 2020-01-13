package com.company.Arrays;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=sc.nextDouble(),
                d=sc.nextDouble();
        double[] arr=new double[n];
        System.out.println(a);
        for (int i=1; i<n;i++)
            arr[i]=a+(i*d);
        for (int i=1; i<n; i++)

            System.out.println(arr[i]);
    }
}
