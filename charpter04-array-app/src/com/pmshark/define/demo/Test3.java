package com.pmshark.define.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //随机排名
        int[] codes = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < codes.length; i++) {
            System.out.println("输入当前第" + (i + 1) + "工号");
            int code = sc.nextInt();
            codes[i] = code;
        }

        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[i];
            codes[i] = codes[index];
            codes[index] = temp;
        }

        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }
}
