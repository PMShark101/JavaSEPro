package com.pmshark.constructor;

public class Test {
    public static void main(String[] args) {
        //构造方法的调用
        Student s = new Student();

        //有参数构造器
        Student s1 = new Student();
        s1.name = "张三";
        s1.score = 100;

        Student s2 = new Student("李四", 99);
        System.out.println(s2.name);
        System.out.println(s2.score);


        Teacher t = new Teacher();
    }

}
