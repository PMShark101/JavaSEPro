package com.pmshark.arrayList;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //商家菜品上架操作
        //1.设计一个菜品类Food，封装菜品对象，封装菜品数据
        //2.设计一个菜品操作类FoodService，封装菜品操作方法：上架和浏览信息
        FoodService fs = new FoodService();
        fs.start();

    }
}
