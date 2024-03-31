package com.pmshark.parameter;

public class MethodDemo2 {
    public static void main(String[] args) {
        //引用类型的参数传递机制：传递的是地址值
        int[] arr = {10, 20, 30};
        System.out.println(arr);
        change(arr);
        System.out.println("newChange = " + arr[1]);
        System.out.println(arr);

    }

    public static void change(int[] arr){
        System.out.println("change1 = " + arr[1]);
        arr[1] = 199;
        System.out.println("change2 = " + arr[1]);

    }

}
