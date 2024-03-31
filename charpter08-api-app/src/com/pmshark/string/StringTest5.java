package com.pmshark.string;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));

    }

    //1.设计一个方法，返回一个指定位数的验证码
    public static String createCode(int n) {
        //2.定义一个字符串，一个保存最终产生的验证码，一个记住可能用到的全部字符
        String code = "";
        String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random r = new Random();
        //3.循环n次，随机产生一个字符，拼接到code上
        for (int i = 0; i < n; i++) {
            //4.随机产生一个下标
            int index = r.nextInt(allChar.length());

            //5.根据下标找到对应的字符
            code += allChar.charAt(index); //code = code + 字符
        }
        //6.返回code
        return code;
    }
}
