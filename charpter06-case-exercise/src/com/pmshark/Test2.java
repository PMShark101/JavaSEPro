package com.pmshark;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*====生成随机验证码====*/
        String code = createCode(8);
        System.out.println("验证码为：" + code);
    }

    public static String createCode(int n) {
        Random r = new Random();
        String code = ""; // 保存生成的验证码
        for (int i = 1; i <= n; i++) {
            //思路：随机一个0,1,2之间的数字出来，0代表随机一个数字字符，1、2代表随机大写字母，小写字母。
            int type = r.nextInt(3); // 0,1,2
            switch (type) {
                case 0:
                    //随机一个数字字符
                    code += r.nextInt(10);
                    break;
                case 1:
                    //随机大写字母
                    code += (char) (r.nextInt(26) + 65);
                    break;
                case 2:
                    //随机小写字母
                    code += (char) (r.nextInt(26) + 97);
                    break;
            }
        }
        return code;
    }
}
