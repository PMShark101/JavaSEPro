package com.pmshark;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //抢红包案例
        int[] moneys = {5, 10, 20, 50, 100};
        start(moneys);
    }

    public static void start(int[] moneys) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入任意内容进行抽奖");
            sc.next(); //阻塞

            //随机抽取一个红包
            while (true) {
                int index = r.nextInt(moneys.length); //0-4
                int money = moneys[index];

            //红包不为0
                if (money > 0) {
                    System.out.println("恭喜抽中了" + money + "元");
                    moneys[index] = 0; //把红包置为0
                    break;
                }
            }
        }
        System.out.println("抽奖结束");
    }
}
