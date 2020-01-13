package com.company.Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      arr[1]=2;
      for (int i=2; i<n;i++)
          arr[i]=arr[i-1]*2;
   for (int i=1; i<n;i++)
       System.out.println(arr[i]);
    }
}