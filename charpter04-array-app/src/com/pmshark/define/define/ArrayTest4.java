package com.pmshark.define.define;

public class ArrayTest4 {
    public static void main(String[] args) {
        //某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
        int[] sales = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        System.out.println("总销售额是：" + sum);
    }
}
