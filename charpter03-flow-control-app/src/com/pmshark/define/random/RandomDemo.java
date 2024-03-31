package com.pmshark.define.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //使用Random()生成一个随机数
        Random r = new Random();
        for (int i = 1; i <= 20; i++) {
            int number = r.nextInt(10); // 0-9
            System.out.println("number = " + number);
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 20; i++) {
            int data2 = r.nextInt(10) + 1; // 1-10
            System.out.println("data2 = " + data2);
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 20; i++) {
            int data3 = r.nextInt(15) + 3;
            System.out.println("data3 = " + data3);
        }
    }
}
