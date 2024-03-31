package com.pmshark.object;

public class Test2 {
    public static void main(String[] args) {
        //类与对象的注意事项
        Student stu = new Student();

        //默认值
        System.out.println(stu.name); //null
        System.out.println(stu.chinese); //0.0
        System.out.println(stu.math); //0.0


        Student stu1 = new Student();
        stu1.name = "张三";

//        Student stu2 = new Student();
//        stu2.name = "李四";

        //引用类型的赋值
        Student stu2 = new Student();
        stu2 = stu1;
        stu2.name = "李四";

        System.out.println(stu1);
        System.out.println(stu2);

//        stu1 = null;
//        stu2 = null;

        System.out.println(stu1.name); //张三
    }
}
