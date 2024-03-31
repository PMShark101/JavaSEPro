package com.pmshark;

public class Test5 {
    public static void main(String[] args) {
        //请把一个整型数组，例如存了数据：11，22，33，拷贝成一个一模一样的新数组出来。
        int[] arr = {11, 22, 33};
        int[] arr2 = copyArray(arr);
        arr2[0] = 100;
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr[0]);

//        int[] arr3 = arr;
//        arr3[0] = 100;
//        printArray(arr);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static int[] copyArray(int[] arr) {
        int[] arr2 = new int[arr.length]; //创建一个新数组
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        printArray(arr2);
        return arr2;

    }
}
