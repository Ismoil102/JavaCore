package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int S=0;
        for (int i=0; i<n;i++)
            a[i] = sc.nextInt();
   for (int i=0; i<n;i++)
       S=S+a[i];
       System.out.println(S);
    }
}