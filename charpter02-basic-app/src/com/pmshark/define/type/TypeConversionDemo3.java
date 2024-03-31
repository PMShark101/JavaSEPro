package com.pmshark.define.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        //强制类型转换
        int a = 99999;
        byte b = (byte)a;//强制转换
        System.out.println(a);
        System.out.println(b);

        double d = 99.5;
        int m = (int)d;
        System.out.println(m); //丢掉小数部分，保留整数部分
    }
}
