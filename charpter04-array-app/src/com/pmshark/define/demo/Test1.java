package com.pmshark.define.demo;

public class Test1 {
    public static void main(String[] args) {
        //数组元素求最值
        int[] faceScores = {79, 88, 91, 96, 105, 103, 99, 89, 92};
        int max = faceScores[0];
        int min = faceScores[0];
        for (int i = 1; i < faceScores.length; i++) {
            if (faceScores[i] > max) {
                max = faceScores[i];
            }
            if (faceScores[i] < min) {
                min = faceScores[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);

    }
}
