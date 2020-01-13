package com.company.Arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        int i;
       for ( i=0; i<n; i++)
           arr[i]=sc.nextDouble();
       for (i=0; i<n;i++)
           System.out.println(arr[i]);
           System.out.println(arr[n - i]);

    }
}