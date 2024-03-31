package com.pmshark.arrayList;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //1.创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA入门到放弃");
        list.add("小熊饼干");
        list.add("小鱼饼干");
        list.add("小猫饼干");
        list.add("小狗饼干");
        list.add("小鸟饼干");
        list.add("小猪饼干");
        System.out.println(list);

        //2.从集合中找到包含饼干的数据，并删除
//        for (int i = 0; i < list.size(); i++) {
//            //3.获取集合中的元素
//            String s = list.get(i);
//
//            //4.判断是否包含饼干
//            if (s.contains("饼干")) {
//                //5.删除包含饼干的数据
//                list.remove(s);
//                i--; //删除一个元素后，索引要减1
//            }
//        }

        //方法2
        for (int i = list.size() - 1; i >= 0; i--) {
            String s = list.get(i);
            if (s.contains("饼干")) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
