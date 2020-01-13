package com.company.Arrays;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    double[] arr=new double[n];
      for ( int i=0; i<n; i++)
          arr[i]=sc.nextDouble();
     for (int i=n; i<=arr[0];i--)
         System.out.println(arr[i]);

    }
}
