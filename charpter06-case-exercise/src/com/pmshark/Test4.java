package com.pmshark;

import static java.util.Collections.reverse;

public class Test4 {
    public static void main(String[] args) {
    /*
        某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，
        加密规则是：对密码中的每位数，都加5，再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序！
    */
        String ps = passwordChange(4628);
        System.out.println("加密后的密码为:" + ps);
    }

    public static String passwordChange(int password) {
        //将4位数字密码拆分成4个数字 a b c d
        int[] numbers = split(password);

        //对密码中的每位数，都加5，再对10求余
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }

        //将所有数字顺序反转
        reverse(numbers);

        //将4个数字组合成一个新的数字
        String newPassword = combine(numbers);
        return newPassword;
    }

    private static String combine(int[] numbers) {
        //将4个数字组合成一个新的数字
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    private static void reverse(int[] numbers) {
        //将所有数字顺序反转
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }

    private static int[] split(int password) {
        //将4位数字密码拆分成4个数字 a b c d
        int[] numbers = new int[4];
        numbers[0] = password / 1000;
        numbers[1] = password / 100 % 10;
        numbers[2] = password / 10 % 10;
        numbers[3] = password % 10;
        return numbers;
    }
}
