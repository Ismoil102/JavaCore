package com.company.oop;

import com.company.Employee;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Employee e = new Employee("Иванов И.И.", "Минск, Беларусь", 43);
        System.out.println("\n Вызываем mailCheck, используя ссылку Employee --");
        e.mailCheck();
    }
}



