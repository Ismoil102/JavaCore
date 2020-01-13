package com.company.Arrays;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] F=new int[n];
        F[1]=1;
        F[2]=1;
        for (int k=3; k<n;k++)
            F[k]=F[k-2]+F[k-1];
        for (int k=1;k<n; k++)
            System.out.println(F[k]);
    }
}
