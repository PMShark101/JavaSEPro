package com.pmshark.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类：负责上架和浏览菜品信息
 */
public class FoodService {
    //1.定义一个ArrayList集合对象，存储菜品信息
    private ArrayList<Food> foodList = new ArrayList<Food>();

    //2.上架菜品
    public void addFood() {
        //3.将菜品对象添加到集合中
        Food food = new Food();

        //4.录入菜品信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菜品名称：");
        String foodName = sc.nextLine();
        food.setName(foodName);

        System.out.println("请输入菜品价格：");
        double foodPrice = sc.nextDouble();
        food.setPrice(foodPrice);

        System.out.println("请输入菜品描述：");
        String foodDesc = sc.nextLine();
        food.setDesc(foodDesc);

        foodList.add(food);
        System.out.println("上架成功");
    }

    //5.浏览菜品信息
    public void showFood() {
        if (foodList.size() == 0) { //判断集合中是否有菜品信息
            System.out.println("暂无菜品信息");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println(food.getName());
            System.out.println(food.getPrice());
            System.out.println(food.getDesc());
            System.out.println("==================================");


        }
    }

    //展示操作界面
    public void start() {
        System.out.println("请选择功能");
        System.out.println("1.上架菜品");
        System.out.println("2.浏览菜品");
        System.out.println("3.退出");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入功能编号：");
        String command = sc.next();
        switch (command) {
            case "1":
                addFood();
                break;
            case "2":
                showFood();
                break;
            case "3":
                System.out.println("退出");
                break;
            default:
                System.out.println("输入错误");
                start();
                break;
        }

    }

}
