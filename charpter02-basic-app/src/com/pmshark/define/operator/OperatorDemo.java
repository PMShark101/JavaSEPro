package com.pmshark.define.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        double score = 99.5;
        String rs = score >= 60 ? "及格" : "不及格";
        System.out.println(rs);

        int a = 99;
        int b = 69;
        int max = a > b ? a : b;
        System.out.println(max);

        int i = 10;
        int j = 45;
        int k = 34;

        int temp = i > j ? i : j;
        int max2 = temp > k ? temp : k;
        System.out.println(max2);

        //优先级
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); //先执行&&，再执行||
        System.out.println((10 > 3 || 10 > 3) && 10 < 3); //先执行||，再执行&&

    }
}
