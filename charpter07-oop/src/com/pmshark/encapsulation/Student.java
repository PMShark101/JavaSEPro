package com.pmshark.encapsulation;

public class Student {
    private double score;


    public void setScore(double score) {
        //对数据进行合法性校验
        if (score < 0 || score > 100) {
            System.out.println("score out of range");
            return;
        }
        this.score = score;
    }

    public double getScore() {

        return score;
    }

    public void printPass() {
        System.out.println(score >= 60 ? "score pass" : "score fail");
    }
}
