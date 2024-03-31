package com.pmshark.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
        name += " Doe"; // name = name + " Doe";
        name += " is a good";
        System.out.println(name);


        //只会存储一份
        String name1 = "abc";
        String name2 = "abc";
        System.out.println((name1 == name)); // true

        //new String创建字符串对象每次new出来的都是一个新对象，存放在堆内存中
        char[] chars = {'a', 'b', 'c'};
        String s1 = new String (chars);
        String s2 = new String (chars);
        System.out.println((s1 == s2)); // false

        String a1 = "abc";
        String a2 = "a" + "b" + "c";
        System.out.println(a1 == a2);

    }
}
