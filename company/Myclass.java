package com.company;

public class Myclass {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        printArr(a);
        printArr(new int[]{40, 50, 60});
    }


    public static void printArr(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}