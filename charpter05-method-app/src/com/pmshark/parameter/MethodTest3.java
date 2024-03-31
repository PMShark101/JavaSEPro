package com.pmshark.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        printArray(array);

        int[] arr2 = null;
        printArray(arr2);

        int[] arr3 = {};
        printArray(arr3);
    }
    public static void printArray(int[] arr){

        if (arr == null) {
            System.out.println("null");
            return; //跳出当前方法
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            }else
//                System.out.print(arr[i] + ", ");
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}
