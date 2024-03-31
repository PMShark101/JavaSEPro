package com.pmshark.demo;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //展示系统全部电影信息
    public void printAllMovies() {
        System.out.println("系统全部电影信息如下");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影编号" + m.getId());
            System.out.println("电影名称" + m.getName());
            System.out.println("电影价格" + m.getPrice());
            System.out.println("------------------------");

        }
    }

    //根据电影名称查询电影信息
    public void searchById(int id) {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println("该电影详情如下");
                System.out.println("电影编号" + m.getId());
                System.out.println("电影名称" + m.getName());
                System.out.println("电影价格" + m.getPrice());
                System.out.println("电影评分" + m.getScore());
                System.out.println("导演" + m.getDirector());
                System.out.println("主演" + m.getActor());
                System.out.println("其他信息" + m.getInfo());
                return; //找到了就不用再找了
            }
        }
        System.out.println("没有找到该电影");
    }
}
