package com.company;

import java.util.Scanner;

public class Proc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=1; i<=5;i++){
            double a=sc.nextDouble();
            double f=powerA3(a);
            System.out.println("A"+i+"="+f);
        }

    }

    public static double powerA3(double a){
        double b=a*a*a;
        return b;

    }
}
