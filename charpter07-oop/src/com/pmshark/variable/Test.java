package com.pmshark.variable;

public class Test {
    public static void main(String[] args) {
        //1.类中位置不同，成员变量：类中方法外；局部变量：方法内
        int a = 20;

        //2.声明位置不同，成员变量：可以在声明时指定默认值；局部变量：必须先声明，后赋值
//        int b;
//        System.out.println(b); //编译错误：变量b未初始化

        //3.内存中位置不同，成员变量：堆内存；局部变量：栈内存
        //4.生命周期不同，成员变量：随着对象的创建而存在，随着对象的消失而消失；局部变量：随着方法的调用而存在，随着方法的调用完毕而消失

    }
}
