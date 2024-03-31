package com.pmshark;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //评委打分[0-100]，减去最低分和最高分，求平均分
        int[] scores = new int[6];
        double avg = averageScore(scores);
        System.out.println("平均分：" + avg);
    }

    public static double averageScore(int[] scores) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入第" + (i + 1) + "位评委的分数：");
            int score = sc.nextInt();
            scores[i] = score;
        }

        //计算总分，找出最高分和最低分
        int sum = 0; //总分
        int max = scores[0]; //最高分
        int min = scores[0]; //最低分

        //遍历找出数据
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        double avg = 1.0 * (sum - max - min) / (scores.length - 2);
        return avg;
    }

}
