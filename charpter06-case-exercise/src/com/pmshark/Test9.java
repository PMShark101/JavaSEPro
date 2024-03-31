package com.pmshark;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //打印三角形
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数：");
        int line = scanner.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k % 2 == 0 ? " " : "*");
            }
            System.out.println(); //换行
        }
    }
}
