package com.company.Procedure;

import java.util.Scanner;

public class Proc7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k;
        for (int i=1; i<=5;i++){
            k=sc.nextInt();
            System.out.println("k"+i+"="+k);
            System.out.println(invDigits(k));
        }
    }
    public static int invDigits(int k){
        int s=0;
         while(k>0){
           s=s*10+(k%10);
           k=k/10;
        }
        k=s;
        return k;
    }
}
