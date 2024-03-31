package com.pmshark;

public class Test7_3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("当前素数的个数是" + count);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
