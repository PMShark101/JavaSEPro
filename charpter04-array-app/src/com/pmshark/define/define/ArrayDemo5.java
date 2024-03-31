package com.pmshark.define.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //动态数组的初始化
        int[] ages = new int[3];

        ages[0] = 18;
        ages[1] = 20;
        ages[2] = 22;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println("-------------------");

        char[] chars = new char[3];
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);

        System.out.println("-------------------");

        double[] scores = new double[80];
        System.out.println(scores[0]);
        System.out.println(scores[79]);

        System.out.println("-------------------");

        boolean[] flags = new boolean[100];
        System.out.println(flags[0]);
        System.out.println(flags[99]);

        System.out.println("-------------------");

        String[] names = new String[80];
        System.out.println(names[0]);
        System.out.println(names[79]);
    }
}
