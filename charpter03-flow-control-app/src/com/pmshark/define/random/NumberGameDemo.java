package com.pmshark.define.random;

import java.util.Random;
import java.util.Scanner;

public class NumberGameDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入你猜的数字: ");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("猜大了");
            } else if (guessNumber < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
            }

    }
}
