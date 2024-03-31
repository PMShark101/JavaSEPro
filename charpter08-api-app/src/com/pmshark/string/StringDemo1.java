package com.pmshark.string;

import java.util.SplittableRandom;

public class StringDemo1 {
    public static void main(String[] args) {
        String name = "itmshark";
        System.out.println(name);

        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("itmshark");
        System.out.println(rs2);

        char[] chars = {'i', 't', 'm', 's', 'h', 'a', 'r', 'k'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);
        System.out.println(rs4);

    }
}
