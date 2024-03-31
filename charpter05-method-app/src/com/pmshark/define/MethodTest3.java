package com.pmshark.define;

public class MethodTest3 {
    public static void main(String[] args) {
        int sum = add(100);
        System.out.println("sum is " + sum);
    }

    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
