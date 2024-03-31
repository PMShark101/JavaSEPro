package com.pmshark.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println("newChange = " + a); //10
    }

    public static void change(int a){
        System.out.println("change1 = " + a); //10
        a = 20;
        System.out.println("change2 = " + a); //20
    }
}
