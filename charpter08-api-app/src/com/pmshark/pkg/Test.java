package com.pmshark.pkg;


import com.pmshark.pkg.itcast.Demo1;
import com.pmshark.pkg.itpmshark.Demo2;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.同一个包下的程序，可以直接访问
        Demo d1 = new Demo();
        d1.print();

        //2.不同包下的程序，需要导入包
        Demo1 d2 = new Demo1();
        d2.print();

        //3.自己的程序中调用Java提供的程序，也需要导入包
        Scanner sc = new Scanner(System.in);
        String s = "abc"; //但java.lang包中的程序不需要导入包
        Random r = new Random(); //java.util包中的程序需要导入包

        //4.不同包下的程序，需要指定包
        Demo2 d3 = new Demo2();
        d3.print();

        com.pmshark.pkg.itcast.Demo2 d4 = new com.pmshark.pkg.itcast.Demo2();
        d4.print();


    }
}
