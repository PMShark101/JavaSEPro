package com.pmshark.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.设计一个电影类
        //2.设计一个电影操作类
        //3.准备全部电影数据
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "流浪地球", 38.9, 8.0, "吴京", "屈楚萧", "12万人想看");
        movies[1] = new Movie(2, "疯狂的外星人", 28.9, 7.0, "黄渤", "沈腾", "10万人想看");
        movies[2] = new Movie(3, "飞驰人生", 18.9, 6.0, "沈腾", "黄渤", "8万人想看");
        movies[3] = new Movie(4, "新喜剧之王", 8.9, 5.0, "王宝强", "鄂靖文", "6万人想看");

        //4.打印全部电影数据
        MovieOperator movieOperator = new MovieOperator(movies);
//        movieOperator.printAllMovies();
//        movieOperator.searchById(3);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==电影信息系统==");
            System.out.println("1.查询所有电影");
            System.out.println("2.根据id查询电影");
            System.out.println("请您输入操作命令");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询所有电影
                    movieOperator.printAllMovies();
                    break;
                case 2:
                    //根据id查询电影
                    System.out.println("请输入电影id");
                    int id = sc.nextInt();
                    movieOperator.searchById(id);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
