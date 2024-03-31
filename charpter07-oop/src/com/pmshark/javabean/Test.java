package com.pmshark.javabean;

public class Test {
    public static void main(String[] args) {
        //实体类的使用
        Student s1 = new Student();
        s1.setName("张三");
        s1.setScore(100);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();

    }
}
