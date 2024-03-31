package com.pmshark.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        //方法重载应用
        String contry = "Japan";
        fire(contry);

    }

    public static void fire() {
        System.out.println("1 place, 1 bullet");
    }

    public static void fire(String country) {
        System.out.println("x place, 1 bullet");
    }

    public static void fire(String country, int num) {
        System.out.println("x place, " + num + " bullet");
    }
}
