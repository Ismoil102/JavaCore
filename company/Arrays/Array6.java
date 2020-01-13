package com.company.Arrays;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),
                a=sc.nextInt(),
                b=sc.nextInt();
        int[] arr=new int[n];
        int S=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=3; i<n;i++)
            S=a+b;
        System.out.println(S);
        for (int i=3; i<n; i++){
            S=S+S;
            System.out.println(S);
    }}
}
