package com.pmshark.javabean;

public class Student {
    //必须私有成员变量， 并为每个成员变量都提供get和set方法
    private String name;
    private double score;


    //必须提供公开的无参构造器
    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
