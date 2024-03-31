package com.pmshark.define.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入age: ");
        int age = sc.nextInt();
        System.out.println("age = " + age);

        System.out.println("请输入name: ");
        String name = sc.next();
        System.out.println("Welcome " + name);

    }
}
