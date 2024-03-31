package com.pmshark.define.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //数组的访问
        int[] arr = new int[]{12, 24, 47};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("-------------------");

        arr[0] = 66;
        arr[2] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("-------------------");

        System.out.println(arr.length);

        System.out.println("-------------------");

        //获取数组的最大索引，前提是数组的长度至少是1
        System.out.println(arr.length - 1);

        System.out.println("-------------------");

        int[] arr2 = new int[]{};
        System.out.println(arr2.length - 1);
    }
}
