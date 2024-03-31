package com.pmshark.define.loop;

public class LoopNestedDemo {
    public static void main(String[] args) {
        //循环嵌套的执行流程
        int day = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("HelloWorld\n");
            }
            System.out.println("---------------------------------day" + day++);
        }
    }
}
