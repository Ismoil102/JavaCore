package com.company.Arrays;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        for (int i=0; i<n; i++)
            arr[i]=sc.nextDouble();
        for (int i=1; i<n;i+=2)
            System.out.println(arr[i]);
        for (int i=0; i<n; i+=2)
            System.out.println(arr[i]);
    }
}
