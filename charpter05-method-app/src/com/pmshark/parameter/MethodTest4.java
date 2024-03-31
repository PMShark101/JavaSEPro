package com.pmshark.parameter;

import java.time.Instant;

public class MethodTest4 {
    public static void main(String[] args) {
        //判断两个int类型的数组是否一样
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println(equals(arr1, arr2));

    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }

        if (arr1 == null || arr2 == null) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        if (arr1.length == arr2.length) { //数组长度相等
            for (int i = 0; i < arr1.length; i++) { //遍历数组
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
