package com.pmshark.define.loop;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i is " + i);
            double d = Math.random();
        }
    }
}
