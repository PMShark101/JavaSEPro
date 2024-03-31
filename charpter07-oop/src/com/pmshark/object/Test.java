package com.pmshark.object;

public class Test {
    public static void main(String[] args) {
        //面向对象编程
        //创建学生对象
        Student stu1 = new Student(); //类名 对象名 = new 类名();
        stu1.name = "张三";
        stu1.chinese = 100;
        stu1.math = 99;
        stu1.printTotalScore();
        stu1.printAverageScore();

        //创建学生对象
        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.chinese = 90;
        stu2.math = 80;
        stu2.printTotalScore();
        stu2.printAverageScore();

        System.out.println(stu1);
        System.out.println(stu2);
    }
}
