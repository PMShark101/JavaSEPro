package com.pmshark.define.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        byte i = 10;
        short j =30;
        int rs3 = i + j;
        System.out.println(rs3);

        byte b1 = 10;
        byte b2 = 80;
        int b3 = b1 + b2;
        System.out.println(b3);
    }
}
