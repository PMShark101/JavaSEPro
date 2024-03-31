package com.pmshark.define.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);

        int[] arr = new int[]{12, 24, 36};
        System.out.println(arr);

        System.out.println(arr[1]);

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
