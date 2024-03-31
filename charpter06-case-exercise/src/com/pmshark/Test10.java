package com.pmshark;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //双色球系统的开发
        int[] userNumbers = userSelectNumbers();
        System.out.println("您选择的号码为：");
        printArray(userNumbers);

        int[] randomNumbers = randomSelectNumbers();
        System.out.println("机选的号码为：");
        printArray(randomNumbers);

        //判断用户选择的号码和机选的号码是否一致
        judge(userNumbers, randomNumbers);
    }

    public static void printArray(int[] arr) {
        //打印数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", "); //判断是否是最后一个元素
        }
        System.out.println("]");
    }

    public static int[] userSelectNumbers() {
        //创建一个整形数组，用于存放用户选择的7个号码
        int[] userNumbers = new int[7];

        Scanner scanner = new Scanner(System.in);

        //创建一个循环，用于接收用户输入的6个红球号码
        for (int i = 0; i < userNumbers.length - 1; i++) {
            while (true) {
                //提示用户输入红球号码
                System.out.println("请输入第" + (i + 1) + "红球号码(1-33)之间不能重复：");

                //接收用户输入的红球号码(1-33之间且不能重复)
                int number = scanner.nextInt();

                //判断用户输入的红球号码是否合法
                if (number < 1 || number > 33) {
                    System.out.println("您输入的红球号码不合法，请重新输入！");
                } else {
                    //判断用户输入的红球号码是否重复
                    if (isRepeat(userNumbers, number)) {
                        System.out.println("您输入的红球号码重复，请重新输入！");
                    } else {
                        userNumbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            //提示用户输入蓝球号码
            System.out.println("请输入蓝球号码(1-16)：");
            int number = scanner.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起您输入的蓝球号码范围不对");
            } else {
                userNumbers[6] = number;
                break;
            }
        }
        return userNumbers;
    }

    public static boolean isRepeat(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            //判断number这个数字，是否在arr[]中存在
            if (arr[i] == 0) {
                break;
            }
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] randomSelectNumbers() {
        //创建一个整形数组，用于存放机选的7个号码
        int[] randomNumbers = new int[7];

        Random random = new Random();

        //创建一个循环，用于接收机选的6个红球号码
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            while (true) {
                int number = random.nextInt(33) + 1;
                if (!isRepeat(randomNumbers, number)) { //判断number这个数字是否在randomNumbers[]中存在
                    randomNumbers[i] = number;
                    break;
                }
            }
        }

        //接收机选的蓝球号码
        randomNumbers[6] = random.nextInt(16) + 1;
        return randomNumbers;
    }

    public static void judge(int[] userNumbers, int[] randomNumbers) {
        //判断用户选择的号码和机选的号码是否一致
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userNumbers.length - 1; i++) {
            //判断用户选择的红球号码和机选的红球号码是否一致
            for (int j = 0; j < randomNumbers.length - 1; j++) {
                if (userNumbers[i] == randomNumbers[j]) {
                    redCount++;
                    break;
                }
            }
        }
        //判断用户选择的蓝球号码和机选的蓝球号码是否一致
        blueCount = userNumbers[6] == randomNumbers[6] ? 1 : 0;

        System.out.println("命中的红球数量是" + redCount + "，命中的蓝球数量是" + blueCount);

        //判断用户中奖等级
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜中奖1000w");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜中奖500w");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜中奖3000");
        } else if (redCount == 5 && blueCount == 0) {
            System.out.println("恭喜中奖200");
        } else if (redCount == 4 && blueCount == 1) {
            System.out.println("恭喜中奖100");
        } else if (redCount == 4 && blueCount == 0) {
            System.out.println("恭喜中奖10");
        } else if (redCount == 3 && blueCount == 1) {
            System.out.println("恭喜中奖5");
        } else if (redCount == 2 && blueCount == 1) {
            System.out.println("恭喜中奖5");
        } else if (redCount == 1 && blueCount == 1) {
            System.out.println("恭喜中奖5");
        } else if (redCount == 0 && blueCount == 1) {
            System.out.println("恭喜中奖5");
        } else {
            System.out.println("很遗憾，您没有中奖！");
        }
    }
}
