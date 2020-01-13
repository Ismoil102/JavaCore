package com.company;


public class Proc8 {
    public static void main(String[] args) {
         Class1 c=new Class1();
        System.out.println(c.s);
    }

    static class Class1 {
        public String s = "Явная инициализация";

        public Class1() {
            System.out.println(s);
            s = "Конструктор";
        }

        {
            System.out.println(s);
            s = "Блок";

        }
    }}




