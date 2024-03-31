package com.pmshark.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        //方法的完整定义
        int rs = add(10, 29);
        System.out.println("sum is " + rs);

        int rs2 = add(100, 200);
        System.out.println("sum is " + rs2);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
