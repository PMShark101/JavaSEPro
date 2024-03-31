package com.pmshark;

public class Test7 {
    public static void main(String[] args) {
        //找素数
        System.out.println("当前素数的个数是" + search(101, 200));
    }

    public static int search(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {

            //信号位思想
            boolean flag = true; //假设i是素数

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = false; //i不是素数
                    break;
                }
            }

            //输出素数
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        return count;

    }
}
