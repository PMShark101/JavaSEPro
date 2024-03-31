package com.pmshark.define.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //数组
        int[] arr = new int[]{1, 2, 3}; //数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3};
        double[] scores = new double[]{98.5, 99.0, 97.5, 96.0, 100};
        System.out.println(arr);
        System.out.println(scores);

        //简化
        int[] arr2 = {1, 2, 3};
        double[] scores2 = {98.5, 99.0, 97.5, 96.0, 100};

        //不建议
        int arr3[] = {1, 2, 3};
        double scores3[] = {98.5, 99.0, 97.5, 96.0, 100};


    }
}
