package com.pmshark.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        System.out.println("starting!");
        chu(8, 0);
        System.out.println("Ending!");
    }

    public static void chu(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Data erroring!");
            return; //return的作用时在无返回值的方法中用来结束当前方法的执行
        }
        int c = a / b;
        System.out.println("除法的结果是：" + c);
    }
}
