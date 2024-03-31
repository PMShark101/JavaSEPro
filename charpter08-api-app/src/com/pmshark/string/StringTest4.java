package com.pmshark.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { //循环三次
            //1.开发一个登陆界面
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String loginName = sc.nextLine();
            System.out.println("请输入密码：");
            String loginPwd = sc.nextLine();

            //5.开始调用登陆方法，判断登陆是否成功
            boolean rs = login(loginName, loginPwd);
            if (rs) {
                System.out.println("登陆成功");
                break; //退出循环
            } else {
                System.out.println("登陆失败");
            }
        }
    }

    //2.开发一个登陆方法，接收用户的用户名和密码，返回认证的结果
    public static boolean login(String loginName, String loginPwd) {
        //3.假设数据库中的用户名和密码分别是admin和123
        String okLoginName = "admin";
        String okLoginPwd = "123";

        //4.比较用户输入的用户名和密码和数据库中的用户名和密码是否一致
//        if (okLoginName.equals(loginName) && okLoginPwd.equals(loginPwd)) {
//            return true;
//        }else{
//            return false;
//        }
        return okLoginName.equals(loginName) && okLoginPwd.equals(loginPwd); //简化写法
    }
}


