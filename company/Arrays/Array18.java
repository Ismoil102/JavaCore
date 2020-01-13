package com.company.Arrays;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args)  {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int i, k = 0;
        for (i = 0; i <=10; i++)
            a[i] = sc.nextInt();
        for (i = 0; i <= 10; i++) {
            if (a[i] < a[9])
                k = a[i];
            System.out.println(k);
        }

    }
        }