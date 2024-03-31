package com.pmshark.thisdemo;

public class Student {
    double score;
    public void printThis() {
        System.out.println(this);
    }

    public void printPass(double score) {
        if (this.score > score) { //this的作用是指代当前对象
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
