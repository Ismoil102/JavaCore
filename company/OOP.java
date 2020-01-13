package com.company;

import java.util.Scanner;

public class OOP {

    public static class Kvadrat {
    double a,b,c;
    void resha(){
        double d,x1,x2;
        d=b*b-4*a*c;
        if(d<0){
            System.out.println("Resha nadorad");
        }
        else
            if (d>=0){
                x1=(-b+Math.sqrt(d));
                x2=(-b-Math.sqrt(d));
                System.out.println(x1+" "+x2);
            }
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Kvadrat k=new Kvadrat();
    k.a=sc.nextDouble();
    k.b=sc.nextDouble();
    k.c=sc.nextDouble();
k.resha();
    }
    }


