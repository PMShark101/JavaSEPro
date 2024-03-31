package com.pmshark.define.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //多个变量指向同一个数组对象
        int[] arr1 = {12, 24, 36};

        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);
        System.out.println(arr1);
        System.out.println(arr2);

        arr2 = null;
        System.out.println(arr2);

        //System.out.println(arr2[0]);  NullPointerException
        //System.out.println(arr2.length); NullPointerException




    }
}
