package com.pmshark.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        printHelleWorld(1);

        System.out.println("-----------------");

        printHelleWorld(3);

        System.out.println("-----------------");

        int sum = add(1, 2);
        System.out.println(sum);
    }

    public static void printHelleWorld(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("HelloWorld");
        }
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
