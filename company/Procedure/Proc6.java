package com.company.Procedure;

import java.util.Scanner;

public class Proc6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k;
      for (int i=1; i<=5; i++){
          k=sc.nextInt();
          System.out.println(DigitCountSum(k));
      }
    }
    public static int DigitCountSum(int k){
        int c=0;
        int s=0;
        while (k>0){
            s=s+(k % 10);
            c++;
            k=k/10;
        }
        System.out.println(c);
        return s;
    }
}
