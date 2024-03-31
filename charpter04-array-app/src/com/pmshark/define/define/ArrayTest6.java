package com.pmshark.define.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        //某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做为选手得分。\

        Scanner sc = new Scanner(System.in);
        double[] scores = new double[6];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分: ");
            scores[i] = sc.nextDouble(); //录入评委的打分
        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("最终得分是" + sum / scores.length);
    }
}
