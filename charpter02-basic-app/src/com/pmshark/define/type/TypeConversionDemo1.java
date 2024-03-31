package com.pmshark.define.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //自动类型转换
        byte a = 12;
        int b = a; //自动转换
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = c; //自动转换
        System.out.println(c);
        System.out.println(d);

        char ch = 'a';
        int i = ch; //自动转换
        System.out.println(ch);
        System.out.println(i);
    }
}
