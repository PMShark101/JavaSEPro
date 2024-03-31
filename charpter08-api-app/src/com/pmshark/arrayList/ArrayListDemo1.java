package com.pmshark.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.Create an ArrayList
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add(6666);
        list.add("....");
        list.add("Hello");

        System.out.println(list);

        //2.Access an element
        list.add(1, "comedown");
        System.out.println(list);

        //3.返回指定索引处的元素
        String rs = list.get(1).toString();
        System.out.println(rs);

        //4.获取集合的大小（元素个数）
        System.out.println(list.size());

        //5.删除指定索引处的元素
        String rs1 = list.remove(1).toString();
        System.out.println(rs1);
        System.out.println(list);

        //6.直接删除指定元素，删除成功返回true，失败返回false
        System.out.println(list.remove("Hello")); //删除第一次出现的Hello
        System.out.println(list);

        //7.修改指定索引处的元素
        list.set(1, "CNCS");
        System.out.println(list);
    }
}
