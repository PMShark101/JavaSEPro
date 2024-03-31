package com.pmshark.define;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        //判断一个数是奇数还是偶数
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数: ");
        int number = sc.nextInt();
        judge(number);

    }
    public static void judge(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}
