package com.pmshark.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "PMShark's JAVA";

        //功能：返回字符串的长度。
        System.out.println(s.length());

        //功能：返回指定索引处的 char 值。
        char c = s.charAt(1);
        System.out.println(c);

        //字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        System.out.println("---------------------------------");

        //把字符串转化为字符数组，再遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("---------------------------------");

        //判断字符串内容，内容一样就返回true
        String s1 = new String("PMShark's JAVA");
        String s2 = new String("PMShark's JAVA");
        System.out.println((s1 == s2)); //判断地址 false
        System.out.println(s1.equals(s2)); //判断内容 true

        //忽略大小写比较字符串内容
        String c1 = "34AeFG";
        String c2 = "34aefg";
        System.out.println((c1 == c2)); //false
        System.out.println(c1.equalsIgnoreCase(c2));  //true

        //截取字符串内容
        String s3 = "JAVA is one of the best language";
        String rs = s3.substring(0,14);
        System.out.println(rs);

        //从当前索引位置一直截取字符串的末尾
        String rs2 = s3.substring(11);
        System.out.println(rs2);

        //把字符串中的某个内容替换为新的内容并替换
        String info = "The moive is very good!";
        String rs3 = info.replace("good","****");
        System.out.println(rs3);

        //判断字符串中是否包含某个关键字
        String info2 = "JAVA is one of the best language, i love JAVA, JAVA don't love me!";
        System.out.println(info2.contains("JAVA")); //true
        System.out.println(info2.contains("JAVA")); //false
        System.out.println(info2.contains("JAVA2")); //false

        //判断字符串是否以指定的内容开头
        String rs4 = "邓泽庭";
        System.out.println(rs4.startsWith("邓"));
        System.out.println(rs4.startsWith("邓泽"));
        System.out.println(rs4.startsWith("邓泽t"));

        //把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String rs5 = "张三,李四,王五,赵六";
        String[] string = rs5.split(",");
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
    }
}
